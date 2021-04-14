package com.example.muslim;

import java.io.Serializable;

public class Alhagr implements Serializable {
    private String ayat;

    public Alhagr() {
    }

    public Alhagr (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
