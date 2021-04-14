package com.example.muslim;

import java.io.Serializable;

public class AlanaamEx implements Serializable {
    private String ayat;

    public AlanaamEx() {
    }

    public AlanaamEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
