package com.example.muslim;

import java.io.Serializable;

public class Alshams implements Serializable {
    private String ayat;

    public Alshams() {
    }

    public Alshams (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
