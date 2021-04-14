package com.example.muslim;

import java.io.Serializable;

public class Algomaa implements Serializable {
    private String ayat;

    public Algomaa() {
    }

    public Algomaa (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
