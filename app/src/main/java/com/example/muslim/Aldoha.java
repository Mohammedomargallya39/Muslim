package com.example.muslim;

import java.io.Serializable;

public class Aldoha implements Serializable {
    private String ayat;

    public Aldoha() {
    }

    public Aldoha (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
