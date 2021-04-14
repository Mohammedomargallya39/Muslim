package com.example.muslim;

import java.io.Serializable;

public class AlzalzalahEx implements Serializable {
    private String ayat;

    public AlzalzalahEx() {
    }

    public AlzalzalahEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}

