package com.example.muslim;

import java.io.Serializable;

public class Alensheqaq implements Serializable {
    private String ayat;

    public Alensheqaq() {
    }

    public Alensheqaq (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}

