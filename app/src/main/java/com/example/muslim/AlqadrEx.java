package com.example.muslim;

import java.io.Serializable;

public class AlqadrEx implements Serializable {
    private String ayat;

    public AlqadrEx() {
    }

    public AlqadrEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}

