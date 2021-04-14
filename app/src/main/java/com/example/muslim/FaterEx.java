package com.example.muslim;

import java.io.Serializable;

public class FaterEx implements Serializable {
    private String ayat;

    public FaterEx() {
    }

    public FaterEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
