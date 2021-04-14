package com.example.muslim;

import java.io.Serializable;

public class Alfagr implements Serializable {
    private String ayat;

    public Alfagr() {
    }

    public Alfagr (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
