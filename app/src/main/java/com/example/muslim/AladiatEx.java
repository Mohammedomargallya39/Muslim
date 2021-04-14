package com.example.muslim;

import java.io.Serializable;

public class AladiatEx implements Serializable {
    private String ayat;

    public AladiatEx() {
    }

    public AladiatEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}




