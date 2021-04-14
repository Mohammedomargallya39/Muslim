package com.example.muslim;

import java.io.Serializable;

public class AlmozamelEx implements Serializable {
    private String ayat;

    public AlmozamelEx() {
    }

    public AlmozamelEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
