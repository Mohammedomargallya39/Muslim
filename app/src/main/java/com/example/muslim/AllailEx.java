package com.example.muslim;

import java.io.Serializable;

public class AllailEx implements Serializable {
    private String ayat;

    public AllailEx() {
    }

    public AllailEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}

