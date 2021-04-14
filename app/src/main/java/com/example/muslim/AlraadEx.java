package com.example.muslim;

import java.io.Serializable;

public class AlraadEx implements Serializable {
    private String ayat;

    public AlraadEx() {
    }

    public AlraadEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
