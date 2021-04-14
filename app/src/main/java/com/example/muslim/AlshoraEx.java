package com.example.muslim;

import java.io.Serializable;

public class AlshoraEx implements Serializable {
    private String ayat;

    public AlshoraEx() {
    }

    public AlshoraEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
