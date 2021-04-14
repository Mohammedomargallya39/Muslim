package com.example.muslim;

import java.io.Serializable;

public class AltareqEx implements Serializable {
    private String ayat;

    public AltareqEx() {
    }

    public AltareqEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
