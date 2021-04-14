package com.example.muslim;

import java.io.Serializable;

public class AlalaqEx implements Serializable {
    private String ayat;

    public AlalaqEx() {
    }

    public AlalaqEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}



