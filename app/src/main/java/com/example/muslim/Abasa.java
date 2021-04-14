package com.example.muslim;

import java.io.Serializable;

public class Abasa implements Serializable {
    private String ayat;

    public Abasa() {
    }

    public Abasa (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
