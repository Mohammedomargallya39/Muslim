package com.example.muslim;

import java.io.Serializable;

public class Alenfetar implements Serializable {
    private String ayat;

    public Alenfetar() {
    }

    public Alenfetar (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
