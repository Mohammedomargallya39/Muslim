package com.example.muslim;

import java.io.Serializable;

public class Alhaded implements Serializable {
    private String ayat;

    public Alhaded() {
    }

    public Alhaded (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
