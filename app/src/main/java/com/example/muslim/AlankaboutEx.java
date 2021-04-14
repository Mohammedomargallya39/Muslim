package com.example.muslim;

import java.io.Serializable;

public class AlankaboutEx implements Serializable {
    private String ayat;

    public AlankaboutEx() {
    }

    public AlankaboutEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}

