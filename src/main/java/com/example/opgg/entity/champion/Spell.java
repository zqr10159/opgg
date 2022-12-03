package com.example.opgg.entity.champion;

import java.util.List;

@lombok.Data
public class Spell {
    private Key key;
    private String name;
    private String description;
    private Long maxRank;
    private List<Long> rangeBurn;
    private List<Long> cooldownBurn;
    private List<Long> costBurn;
    private String tooltip;
    private String imageUrl;
    private String videoUrl;
}
