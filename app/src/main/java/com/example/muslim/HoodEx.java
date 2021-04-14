package com.example.muslim;

import java.io.Serializable;

public class HoodEx implements Serializable {
    private String ayat;

    public HoodEx() {
    }

    public HoodEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
