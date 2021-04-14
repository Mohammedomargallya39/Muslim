package com.example.muslim;

import java.io.Serializable;

public class AltoubaEx implements Serializable {
    private String ayat;

    public AltoubaEx() {
    }

    public AltoubaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
