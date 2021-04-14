package com.example.muslim;

import java.io.Serializable;

public class FoselatEx implements Serializable {
    private String ayat;

    public FoselatEx() {
    }

    public FoselatEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
