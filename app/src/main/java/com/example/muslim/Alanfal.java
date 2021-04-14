package com.example.muslim;

import java.io.Serializable;

public class Alanfal implements Serializable {
    private String ayat;

    public Alanfal() {
    }

    public Alanfal (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
