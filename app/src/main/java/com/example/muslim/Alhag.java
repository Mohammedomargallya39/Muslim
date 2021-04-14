package com.example.muslim;

import java.io.Serializable;

public class Alhag implements Serializable {
    private String ayat;

    public Alhag() {
    }

    public Alhag (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
