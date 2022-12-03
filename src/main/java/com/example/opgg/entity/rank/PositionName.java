package com.example.opgg.entity.rank;

import java.io.IOException;

public enum PositionName {
    ADC, JUNGLE, MID, SUPPORT, TOP;

    public String toValue() {
        switch (this) {
            case ADC: return "ADC";
            case JUNGLE: return "JUNGLE";
            case MID: return "MID";
            case SUPPORT: return "SUPPORT";
            case TOP: return "TOP";
        }
        return null;
    }

    public static PositionName forValue(String value) throws IOException {
        if (value.equals("ADC")) return ADC;
        if (value.equals("JUNGLE")) return JUNGLE;
        if (value.equals("MID")) return MID;
        if (value.equals("SUPPORT")) return SUPPORT;
        if (value.equals("TOP")) return TOP;
        throw new IOException("Cannot deserialize PositionName");
    }
}
