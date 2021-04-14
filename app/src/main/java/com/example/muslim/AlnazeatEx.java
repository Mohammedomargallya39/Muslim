package com.example.muslim;

import java.io.Serializable;

public class AlnazeatEx implements Serializable {
    private String ayat;

    public AlnazeatEx() {
    }

    public AlnazeatEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
