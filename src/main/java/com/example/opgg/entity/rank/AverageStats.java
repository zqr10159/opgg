package com.example.opgg.entity.rank;

@lombok.Data
public class AverageStats {
    private Double winRate;
    private Double pickRate;
    private Double banRate;
    private Double kda;
    private Long tier;
    private Long rank;
}
