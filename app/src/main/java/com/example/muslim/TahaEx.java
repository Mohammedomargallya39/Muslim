package com.example.muslim;

import java.io.Serializable;

public class TahaEx implements Serializable {
    private String ayat;

    public TahaEx() {
    }

    public TahaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
