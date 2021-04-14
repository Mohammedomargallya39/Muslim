package com.example.muslim;

import java.io.Serializable;

public class Alsafat implements Serializable {
    private String ayat;

    public Alsafat() {
    }

    public Alsafat (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
