package com.example.muslim;

import java.io.Serializable;

public class AlhomazaEx implements Serializable {
    private String ayat;

    public AlhomazaEx() {
    }

    public AlhomazaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}




