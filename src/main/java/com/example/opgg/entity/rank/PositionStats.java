package com.example.opgg.entity.rank;



@lombok.Data
public class PositionStats {
    private Double winRate;
    private Double pickRate;
    private Double roleRate;
    private Double banRate;
    private Double kda;
    private TierData tierData;
}
