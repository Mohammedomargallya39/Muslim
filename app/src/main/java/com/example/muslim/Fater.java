package com.example.muslim;

import java.io.Serializable;

public class Fater implements Serializable {
    private String ayat;

    public Fater() {
    }

    public Fater (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
