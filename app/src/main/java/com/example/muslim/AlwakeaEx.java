package com.example.muslim;

import java.io.Serializable;

public class AlwakeaEx implements Serializable {
    private String ayat;

    public AlwakeaEx() {
    }

    public AlwakeaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
