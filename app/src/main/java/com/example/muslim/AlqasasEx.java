package com.example.muslim;

import java.io.Serializable;

public class AlqasasEx implements Serializable {
    private String ayat;

    public AlqasasEx() {
    }

    public AlqasasEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
