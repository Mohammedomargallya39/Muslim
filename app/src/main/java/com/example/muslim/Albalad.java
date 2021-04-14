package com.example.muslim;

import java.io.Serializable;

public class Albalad implements Serializable {
    private String ayat;

    public Albalad() {
    }

    public Albalad (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
