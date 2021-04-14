package com.example.muslim;

import java.io.Serializable;

public class Almaaon implements Serializable {
    private String ayat;

    public Almaaon() {
    }

    public Almaaon (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
