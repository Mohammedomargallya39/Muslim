package com.example.muslim;

import java.io.Serializable;

public class AlkaferonEx implements Serializable {
    private String ayat;

    public AlkaferonEx() {
    }

    public AlkaferonEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}




