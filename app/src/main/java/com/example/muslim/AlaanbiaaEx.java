package com.example.muslim;

import java.io.Serializable;

public class AlaanbiaaEx implements Serializable {
    private String ayat;

    public AlaanbiaaEx() {
    }

    public AlaanbiaaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
