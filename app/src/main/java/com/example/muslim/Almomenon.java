package com.example.muslim;

import java.io.Serializable;

public class Almomenon implements Serializable {
    private String ayat;

    public Almomenon() {
    }

    public Almomenon (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
