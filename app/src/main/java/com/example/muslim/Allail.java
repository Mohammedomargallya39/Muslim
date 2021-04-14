package com.example.muslim;

import java.io.Serializable;

public class Allail implements Serializable {
    private String ayat;

    public Allail() {
    }

    public Allail(String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
