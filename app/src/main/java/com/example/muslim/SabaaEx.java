package com.example.muslim;

import java.io.Serializable;

public class SabaaEx implements Serializable {
    private String ayat;

    public SabaaEx() {
    }

    public SabaaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
