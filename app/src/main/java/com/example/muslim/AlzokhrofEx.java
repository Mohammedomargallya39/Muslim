package com.example.muslim;

import java.io.Serializable;

public class AlzokhrofEx implements Serializable {
    private String ayat;

    public AlzokhrofEx() {
    }

    public AlzokhrofEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
