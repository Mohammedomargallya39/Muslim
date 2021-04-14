package com.example.muslim;

import java.io.Serializable;

public class AltakwerEx implements Serializable {
    private String ayat;

    public AltakwerEx() {
    }

    public AltakwerEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
