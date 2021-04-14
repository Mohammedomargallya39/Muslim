package com.example.muslim;

import java.io.Serializable;

public class AlshamsEx implements Serializable {
    private String ayat;

    public AlshamsEx() {
    }

    public AlshamsEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
