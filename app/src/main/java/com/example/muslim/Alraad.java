package com.example.muslim;

import java.io.Serializable;

public class Alraad implements Serializable {
    private String ayat;

    public Alraad() {
    }

    public Alraad (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
