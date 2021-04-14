package com.example.muslim;

import java.io.Serializable;

public class AlmorsalatEx implements Serializable {
    private String ayat;

    public AlmorsalatEx() {
    }

    public AlmorsalatEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
