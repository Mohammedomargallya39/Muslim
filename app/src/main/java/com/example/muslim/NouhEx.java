package com.example.muslim;

import java.io.Serializable;

public class NouhEx implements Serializable {
    private String ayat;

    public NouhEx() {
    }

    public NouhEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
