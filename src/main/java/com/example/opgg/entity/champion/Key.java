package com.example.opgg.entity.champion;

import java.io.IOException;

public enum Key {
    E, Q, R, W;

    public String toValue() {
        switch (this) {
            case E: return "E";
            case Q: return "Q";
            case R: return "R";
            case W: return "W";
        }
        return null;
    }

    public static Key forValue(String value) throws IOException {
        if (value.equals("E")) return E;
        if (value.equals("Q")) return Q;
        if (value.equals("R")) return R;
        if (value.equals("W")) return W;
        throw new IOException("Cannot deserialize Key");
    }
}
