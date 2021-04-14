package com.example.muslim;

import java.io.Serializable;

public class Elbqra implements Serializable {
    private String ayat;

    public Elbqra() {
    }

    public Elbqra (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
