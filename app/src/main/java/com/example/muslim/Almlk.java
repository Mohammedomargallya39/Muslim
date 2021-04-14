package com.example.muslim;

import java.io.Serializable;

public class Almlk implements Serializable {
    private String ayat;

    public Almlk() {
    }

    public Almlk (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
