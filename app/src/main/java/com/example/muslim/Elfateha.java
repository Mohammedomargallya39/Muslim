package com.example.muslim;

import java.io.Serializable;

public class Elfateha implements Serializable {
    private String ayat;

    public Elfateha() {
    }

    public Elfateha (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
