package com.example.muslim;

import java.io.Serializable;

public class AlforqanEx implements Serializable {
    private String ayat;

    public AlforqanEx() {
    }

    public AlforqanEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
