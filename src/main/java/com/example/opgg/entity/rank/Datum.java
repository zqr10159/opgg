package com.example.opgg.entity.rank;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@lombok.Data
@Document(value = "opgg",collection="opgg")
public class Datum {
    private Long id;
    private Boolean isRotation;
    private Boolean isRip;
    private AverageStats averageStats;
    private List<Position> positions;
    private List<Role> roles;
}
