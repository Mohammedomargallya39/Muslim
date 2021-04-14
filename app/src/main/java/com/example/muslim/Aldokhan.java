package com.example.muslim;

import java.io.Serializable;

public class Aldokhan implements Serializable {
    private String ayat;

    public Aldokhan() {
    }

    public Aldokhan (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
