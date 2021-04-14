package com.example.muslim;

import java.io.Serializable;

public class Alfalq implements Serializable {
    private String ayat;

    public Alfalq() {
    }

    public Alfalq (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
