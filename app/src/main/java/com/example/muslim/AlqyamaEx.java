package com.example.muslim;

import java.io.Serializable;

public class AlqyamaEx implements Serializable {
    private String ayat;

    public AlqyamaEx() {
    }

    public AlqyamaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
