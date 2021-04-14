package com.example.muslim;

import java.io.Serializable;

public class Alekhlas implements Serializable {
    private String ayat;

    public Alekhlas() {
    }

    public Alekhlas (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
