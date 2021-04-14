package com.example.muslim;

import java.io.Serializable;

public class Algatheya implements Serializable {
    private String ayat;

    public Algatheya() {
    }

    public Algatheya (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
