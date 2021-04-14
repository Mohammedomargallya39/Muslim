package com.example.muslim;

import java.io.Serializable;

public class AlmolkEx implements Serializable {
    private String ayat;

    public AlmolkEx() {
    }

    public AlmolkEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
