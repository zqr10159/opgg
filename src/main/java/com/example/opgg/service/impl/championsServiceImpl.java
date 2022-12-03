package com.example.opgg.service.impl;

import com.example.opgg.entity.champion.Data;
import com.example.opgg.service.championsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class championsServiceImpl implements championsService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public List<Map<Long, String>> searchAllchampion() {
        List<Data> all = mongoTemplate.findAll(Data.class);
        List<Map<Long, String>> idNameList = new ArrayList<>();
        for (Data d : all){
            Map<Long, String> championMap = new HashMap<>();
            championMap.put(d.getId(),d.getName());
            idNameList.add(championMap);
        }
        return idNameList;
    }
}
