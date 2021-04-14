package com.example.muslim;

import java.io.Serializable;

public class Nouh implements Serializable {
    private String ayat;

    public Nouh() {
    }

    public Nouh (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
