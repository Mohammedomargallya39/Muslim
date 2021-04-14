package com.example.muslim;

import java.io.Serializable;

public class SadEx implements Serializable {
    private String ayat;

    public SadEx() {
    }

    public SadEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
