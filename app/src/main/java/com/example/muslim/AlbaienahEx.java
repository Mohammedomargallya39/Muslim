package com.example.muslim;

import java.io.Serializable;

public class AlbaienahEx implements Serializable {
    private String ayat;

    public AlbaienahEx() {
    }

    public AlbaienahEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}

