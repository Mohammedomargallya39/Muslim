package com.example.muslim;

import java.io.Serializable;

public class AlrahmanEx implements Serializable {
    private String ayat;

    public AlrahmanEx() {
    }

    public AlrahmanEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
