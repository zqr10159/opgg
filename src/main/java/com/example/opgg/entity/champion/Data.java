package com.example.opgg.entity.champion;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@lombok.Data
@Document(value = "champions",collection="champions")
public class Data {
    private Long id;
    private String key;
    private String name;
    private String imageUrl;
    private List<Evolve> evolve;
    private List<String> enemyTips;
    private List<String> allyTips;
    private Passive passive;
    private List<Spell> spells;
}
