package com.example.muslim;

import java.io.Serializable;

public class AlgathyaEx implements Serializable {
    private String ayat;

    public AlgathyaEx() {
    }

    public AlgathyaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
