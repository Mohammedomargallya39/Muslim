package com.example.muslim;

import java.io.Serializable;

public class AltorEx implements Serializable {
    private String ayat;

    public AltorEx() {
    }

    public AltorEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
