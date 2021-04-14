package com.example.muslim;

import java.io.Serializable;

public class Alanaam implements Serializable {
    private String ayat;

    public Alanaam() {
    }

    public Alanaam (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
