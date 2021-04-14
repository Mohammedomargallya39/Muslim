package com.example.muslim;

import java.io.Serializable;

public class AlmaedaEx implements Serializable {
    private String ayat;

    public AlmaedaEx() {
    }

    public AlmaedaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
