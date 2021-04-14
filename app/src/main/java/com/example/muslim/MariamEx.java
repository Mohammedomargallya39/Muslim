package com.example.muslim;

import java.io.Serializable;

public class MariamEx implements Serializable {
    private String ayat;

    public MariamEx() {
    }

    public MariamEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
