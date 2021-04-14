package com.example.muslim;

import java.io.Serializable;

public class AlfatehaEx implements Serializable {
    private String ayat;

    public AlfatehaEx() {
    }

    public AlfatehaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
