package com.example.muslim;

import java.io.Serializable;

public class AlaserEx implements Serializable {
    private String ayat;

    public AlaserEx() {
    }

    public AlaserEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}




