package com.example.muslim;

import java.io.Serializable;

public class Yacen implements Serializable {
    private String ayat;

    public Yacen() {
    }

    public Yacen (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
