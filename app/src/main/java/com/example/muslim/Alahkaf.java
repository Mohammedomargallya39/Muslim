package com.example.muslim;

import java.io.Serializable;

public class Alahkaf implements Serializable {
    private String ayat;

    public Alahkaf() {
    }

    public Alahkaf (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
