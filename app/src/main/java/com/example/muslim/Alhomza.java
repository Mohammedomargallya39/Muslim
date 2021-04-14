package com.example.muslim;

import java.io.Serializable;

public class Alhomza implements Serializable {
    private String ayat;

    public Alhomza() {
    }

    public Alhomza (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
