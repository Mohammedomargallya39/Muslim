package com.example.muslim;

import java.io.Serializable;

public class Alfel implements Serializable {
    private String ayat;

    public Alfel() {
    }

    public Alfel (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
