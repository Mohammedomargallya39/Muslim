package com.example.muslim;

import java.io.Serializable;

public class AlaalaEx implements Serializable {
    private String ayat;

    public AlaalaEx() {
    }

    public AlaalaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
