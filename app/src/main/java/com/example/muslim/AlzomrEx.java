package com.example.muslim;

import java.io.Serializable;

public class AlzomrEx implements Serializable {
    private String ayat;

    public AlzomrEx() {
    }

    public AlzomrEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
