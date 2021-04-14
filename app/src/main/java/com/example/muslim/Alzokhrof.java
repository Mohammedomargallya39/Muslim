package com.example.muslim;

import java.io.Serializable;

public class Alzokhrof implements Serializable {
    private String ayat;

    public Alzokhrof() {
    }

    public Alzokhrof (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
