package com.example.muslim;

import java.io.Serializable;

public class Almorsalat implements Serializable {
    private String ayat;

    public Almorsalat() {
    }

    public Almorsalat (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
