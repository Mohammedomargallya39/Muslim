package com.example.muslim;

import java.io.Serializable;

public class Alaser implements Serializable {
    private String ayat;

    public Alaser() {
    }

    public Alaser (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
