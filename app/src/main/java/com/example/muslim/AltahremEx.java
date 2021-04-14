package com.example.muslim;

import java.io.Serializable;

public class AltahremEx implements Serializable {
    private String ayat;

    public AltahremEx() {
    }

    public AltahremEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
