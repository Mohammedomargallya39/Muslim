package com.example.muslim;

import java.io.Serializable;

public class AlsafatEx implements Serializable {
    private String ayat;

    public AlsafatEx() {
    }

    public AlsafatEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
