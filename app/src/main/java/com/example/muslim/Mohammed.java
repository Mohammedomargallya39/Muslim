package com.example.muslim;

import java.io.Serializable;

public class Mohammed implements Serializable {
    private String ayat;

    public Mohammed() {
    }

    public Mohammed (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
