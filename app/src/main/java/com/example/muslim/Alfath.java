package com.example.muslim;

import java.io.Serializable;

public class Alfath implements Serializable {
    private String ayat;

    public Alfath() {
    }

    public Alfath (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
