package com.example.muslim;

import java.io.Serializable;

public class AlhadedEx implements Serializable {
    private String ayat;

    public AlhadedEx() {
    }

    public AlhadedEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
