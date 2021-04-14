package com.example.muslim;

import java.io.Serializable;

public class Alkareaa implements Serializable {
    private String ayat;

    public Alkareaa() {
    }

    public Alkareaa (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
