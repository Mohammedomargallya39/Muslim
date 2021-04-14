package com.example.muslim;

import java.io.Serializable;

public class AlnasEx implements Serializable {
    private String ayat;

    public AlnasEx() {
    }

    public AlnasEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}




