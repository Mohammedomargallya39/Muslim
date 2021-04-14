package com.example.muslim;

import java.io.Serializable;

public class Almasad implements Serializable {
    private String ayat;

    public Almasad() {
    }

    public Almasad (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
