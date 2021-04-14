package com.example.muslim;

import java.io.Serializable;

public class AlenshqaqEx implements Serializable {
    private String ayat;

    public AlenshqaqEx() {
    }

    public AlenshqaqEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
