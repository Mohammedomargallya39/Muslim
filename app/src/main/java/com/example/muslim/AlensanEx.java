package com.example.muslim;

import java.io.Serializable;

public class AlensanEx implements Serializable {
    private String ayat;

    public AlensanEx() {
    }

    public AlensanEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
