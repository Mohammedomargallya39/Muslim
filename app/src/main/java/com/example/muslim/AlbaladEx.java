package com.example.muslim;

import java.io.Serializable;

public class AlbaladEx implements Serializable {
    private String ayat;

    public AlbaladEx() {
    }

    public AlbaladEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
