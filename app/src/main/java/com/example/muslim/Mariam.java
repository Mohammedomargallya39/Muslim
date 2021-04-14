package com.example.muslim;

import java.io.Serializable;

public class Mariam implements Serializable {
    private String ayat;

    public Mariam() {
    }

    public Mariam (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
