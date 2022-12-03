package com.example.opgg;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;
import com.example.opgg.entity.champion.Champion;
import com.example.opgg.entity.champion.Data;
import com.example.opgg.entity.rank.Datum;
import com.example.opgg.entity.rank.Opgg;
import com.example.opgg.entity.rank.Position;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class OpggApplicationTests {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Test
    void insert() {
        HttpRequest httpRequest = HttpRequest.get("https://op.gg/api/v1.0/internal/bypass/champions/kr/ranked");
        String body = httpRequest.execute().body();
        Opgg opgg = JSONUtil.toBean(body, Opgg.class);
        List<Datum> data = opgg.getData();
        mongoTemplate.insertAll(data);
//        mongoTemplate.insert(data);

    }
    @Test
    void insertChampion() {
        HttpRequest httpRequest = HttpRequest.get("https://op.gg/api/v1.0/internal/bypass/meta/champions?hl=zh_CN");
        String body = httpRequest.execute().body();
        Champion champion = JSONUtil.toBean(body, Champion.class);
        List<Data> data = champion.getData();
        mongoTemplate.insertAll(data);
//        mongoTemplate.insert(data);

    }


    @Test
    void searchAll(){
        List<Datum> all = mongoTemplate.findAll(Datum.class);
        System.out.println(all);
    }

    @Test
    void searchOne(){
        Query query = new Query(Criteria.where("id").is(86));
        Datum champion = mongoTemplate.find(query, Datum.class).get(0);
        List<Position> positions = champion.getPositions();
        System.out.println(positions);
    }
    @Test
    void multiColSearchOne(){
        Query query = new Query(Criteria.where("id").is(86));
        Data champion = mongoTemplate.find(query, Data.class).get(0);
        Map<Long, String> championMap = new HashMap<>();
        championMap.put(champion.getId(),champion.getName());

        System.out.println(championMap);
    }

    @Test
    void searchAllchampion(){
        List<Data> all = mongoTemplate.findAll(Data.class);
        List<Map<Long, String>> idNameList = new ArrayList<>();
        for (Data d : all){
            Map<Long, String> championMap = new HashMap<>();
            championMap.put(d.getId(),d.getName());
            idNameList.add(championMap);
        }
        System.out.println(idNameList);
    }

}
