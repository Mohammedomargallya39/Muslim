package com.example.muslim;

import java.io.Serializable;

public class Foselat implements Serializable {
    private String ayat;

    public Foselat() {
    }

    public Foselat (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
