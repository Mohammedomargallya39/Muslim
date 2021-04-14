package com.example.muslim;

import java.io.Serializable;

public class AlsharhEx implements Serializable {
    private String ayat;

    public AlsharhEx() {
    }

    public AlsharhEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
