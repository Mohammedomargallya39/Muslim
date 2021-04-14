package com.example.muslim;

import java.io.Serializable;

public class Almaeda implements Serializable {
    private String ayat;

    public Almaeda() {
    }

    public Almaeda (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
