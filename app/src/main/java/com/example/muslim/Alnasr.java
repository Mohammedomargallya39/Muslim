package com.example.muslim;

import java.io.Serializable;

public class Alnasr implements Serializable {
    private String ayat;

    public Alnasr() {
    }

    public Alnasr (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
