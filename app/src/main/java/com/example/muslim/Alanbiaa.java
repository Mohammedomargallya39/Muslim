package com.example.muslim;

import java.io.Serializable;

public class Alanbiaa implements Serializable {
    private String ayat;

    public Alanbiaa() {
    }

    public Alanbiaa (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
