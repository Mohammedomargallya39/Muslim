package com.example.muslim;

import java.io.Serializable;

public class AlnamlEx implements Serializable {
    private String ayat;

    public AlnamlEx() {
    }

    public AlnamlEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
