package com.example.muslim;

import java.io.Serializable;

public class AlsafEx implements Serializable {
    private String ayat;

    public AlsafEx() {
    }

    public AlsafEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
