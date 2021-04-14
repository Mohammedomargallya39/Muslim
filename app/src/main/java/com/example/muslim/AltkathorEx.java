package com.example.muslim;

import java.io.Serializable;

public class AltkathorEx implements Serializable {
    private String ayat;

    public AltkathorEx() {
    }

    public AltkathorEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}




