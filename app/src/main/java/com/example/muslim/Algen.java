package com.example.muslim;

import java.io.Serializable;

public class Algen implements Serializable {
    private String ayat;

    public Algen() {
    }

    public Algen (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
