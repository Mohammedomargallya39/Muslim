package com.example.muslim;

import java.io.Serializable;

public class Alghashia implements Serializable {
    private String ayat;

    public Alghashia() {
    }

    public Alghashia (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
