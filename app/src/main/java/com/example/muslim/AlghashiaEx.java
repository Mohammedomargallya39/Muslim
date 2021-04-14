package com.example.muslim;

import java.io.Serializable;

public class AlghashiaEx implements Serializable {
    private String ayat;

    public AlghashiaEx() {
    }

    public AlghashiaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
