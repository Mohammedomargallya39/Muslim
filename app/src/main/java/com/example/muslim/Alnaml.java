package com.example.muslim;

import java.io.Serializable;

public class Alnaml implements Serializable {
    private String ayat;

    public Alnaml() {
    }

    public Alnaml (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
