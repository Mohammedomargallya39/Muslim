package com.example.muslim;

import java.io.Serializable;

public class AbasaEx implements Serializable {
    private String ayat;

    public AbasaEx() {
    }

    public AbasaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
