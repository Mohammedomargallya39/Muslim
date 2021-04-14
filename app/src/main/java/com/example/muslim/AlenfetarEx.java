package com.example.muslim;

import java.io.Serializable;

public class AlenfetarEx implements Serializable {
    private String ayat;

    public AlenfetarEx() {
    }

    public AlenfetarEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
