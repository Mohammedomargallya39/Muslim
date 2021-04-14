package com.example.muslim;

import java.io.Serializable;

public class Alqalm implements Serializable {
    private String ayat;

    public Alqalm() {
    }

    public Alqalm (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
