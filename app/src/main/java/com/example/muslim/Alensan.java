package com.example.muslim;

import java.io.Serializable;

public class Alensan implements Serializable {
    private String ayat;

    public Alensan() {
    }

    public Alensan (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
