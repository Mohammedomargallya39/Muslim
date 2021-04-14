package com.example.muslim;

import java.io.Serializable;

public class Alqadr implements Serializable {
    private String ayat;

    public Alqadr() {
    }

    public Alqadr (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
