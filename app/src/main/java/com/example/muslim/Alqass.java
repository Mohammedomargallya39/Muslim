package com.example.muslim;

import java.io.Serializable;

public class Alqass implements Serializable {
    private String ayat;

    public Alqass() {
    }

    public Alqass (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
