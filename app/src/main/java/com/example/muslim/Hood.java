package com.example.muslim;

import java.io.Serializable;

public class Hood implements Serializable {
    private String ayat;

    public Hood() {
    }

    public Hood (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
