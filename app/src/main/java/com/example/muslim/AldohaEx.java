package com.example.muslim;

import java.io.Serializable;

public class AldohaEx implements Serializable {
    private String ayat;

    public AldohaEx() {
    }

    public AldohaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
