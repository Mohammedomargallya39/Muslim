package com.example.muslim;

import java.io.Serializable;

public class Qaf implements Serializable {
    private String ayat;

    public Qaf() {
    }

    public Qaf (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
