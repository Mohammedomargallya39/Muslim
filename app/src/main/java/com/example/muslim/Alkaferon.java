package com.example.muslim;

import java.io.Serializable;

public class Alkaferon implements Serializable {
    private String ayat;

    public Alkaferon() {
    }

    public Alkaferon (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
