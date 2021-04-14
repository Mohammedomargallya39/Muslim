package com.example.muslim;

import java.io.Serializable;

public class Alaaraf implements Serializable {
    private String ayat;

    public Alaaraf() {
    }

    public Alaaraf (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
