package com.example.opgg.entity.rank;



import java.util.List;

@lombok.Data
public class Position {
    private PositionName name;
    private PositionStats stats;
    private List<Role> roles;
    private List<Counter> counters;
}
