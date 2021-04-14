package com.example.muslim;

import java.io.Serializable;

public class AldokhanEx implements Serializable {
    private String ayat;

    public AldokhanEx() {
    }

    public AldokhanEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
