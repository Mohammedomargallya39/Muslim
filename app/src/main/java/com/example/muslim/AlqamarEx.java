package com.example.muslim;

import java.io.Serializable;

public class AlqamarEx implements Serializable {
    private String ayat;

    public AlqamarEx() {
    }

    public AlqamarEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
