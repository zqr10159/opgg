package com.example.opgg.entity.rank;

import java.io.IOException;

public enum RoleName {
    CONTROLLER, FIGHTER, FIGHTER_ASSASSIN, FIGHTER_SLAYER, MAGE, MARKSMAN, SLAYER, SLAYER_ASSASSIN, SLAYER_SLAYER, TANK, TANK_SLAYER;

    public String toValue() {
        switch (this) {
            case CONTROLLER: return "CONTROLLER";
            case FIGHTER: return "FIGHTER";
            case FIGHTER_ASSASSIN: return "FIGHTER|ASSASSIN";
            case FIGHTER_SLAYER: return "FIGHTER|SLAYER";
            case MAGE: return "MAGE";
            case MARKSMAN: return "MARKSMAN";
            case SLAYER: return "SLAYER";
            case SLAYER_ASSASSIN: return "SLAYER|ASSASSIN";
            case SLAYER_SLAYER: return "SLAYER|SLAYER";
            case TANK: return "TANK";
            case TANK_SLAYER: return "TANK|SLAYER";
        }
        return null;
    }

    public static RoleName forValue(String value) throws IOException {
        if (value.equals("CONTROLLER")) return CONTROLLER;
        if (value.equals("FIGHTER")) return FIGHTER;
        if (value.equals("FIGHTER|ASSASSIN")) return FIGHTER_ASSASSIN;
        if (value.equals("FIGHTER|SLAYER")) return FIGHTER_SLAYER;
        if (value.equals("MAGE")) return MAGE;
        if (value.equals("MARKSMAN")) return MARKSMAN;
        if (value.equals("SLAYER")) return SLAYER;
        if (value.equals("SLAYER|ASSASSIN")) return SLAYER_ASSASSIN;
        if (value.equals("SLAYER|SLAYER")) return SLAYER_SLAYER;
        if (value.equals("TANK")) return TANK;
        if (value.equals("TANK|SLAYER")) return TANK_SLAYER;
        throw new IOException("Cannot deserialize RoleName");
    }
}
