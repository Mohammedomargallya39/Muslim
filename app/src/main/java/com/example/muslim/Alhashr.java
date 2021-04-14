package com.example.muslim;

import java.io.Serializable;

public class Alhashr implements Serializable {
    private String ayat;

    public Alhashr() {
    }

    public Alhashr (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
