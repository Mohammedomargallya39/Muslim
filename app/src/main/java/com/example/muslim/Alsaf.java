package com.example.muslim;

import java.io.Serializable;

public class Alsaf implements Serializable {
    private String ayat;

    public Alsaf() {
    }

    public Alsaf (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
