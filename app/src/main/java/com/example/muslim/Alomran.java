package com.example.muslim;

import java.io.Serializable;

public class Alomran implements Serializable {
    private String ayat;

    public Alomran() {
    }

    public Alomran (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
