package com.example.muslim;

import java.io.Serializable;

public class Alroom implements Serializable {
    private String ayat;

    public Alroom() {
    }

    public Alroom (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
