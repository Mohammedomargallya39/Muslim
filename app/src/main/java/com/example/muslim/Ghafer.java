package com.example.muslim;

import java.io.Serializable;

public class Ghafer implements Serializable {
    private String ayat;

    public Ghafer() {
    }

    public Ghafer (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
