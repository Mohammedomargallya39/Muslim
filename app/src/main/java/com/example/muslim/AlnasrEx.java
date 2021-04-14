package com.example.muslim;

import java.io.Serializable;

public class AlnasrEx implements Serializable {
    private String ayat;

    public AlnasrEx() {
    }

    public AlnasrEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}




