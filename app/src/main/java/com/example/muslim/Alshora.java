package com.example.muslim;

import java.io.Serializable;

public class Alshora implements Serializable {
    private String ayat;

    public Alshora() {
    }

    public Alshora (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
