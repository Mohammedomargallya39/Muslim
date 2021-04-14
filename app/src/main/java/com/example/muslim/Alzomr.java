package com.example.muslim;

import java.io.Serializable;

public class Alzomr implements Serializable {
    private String ayat;

    public Alzomr() {
    }

    public Alzomr (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
