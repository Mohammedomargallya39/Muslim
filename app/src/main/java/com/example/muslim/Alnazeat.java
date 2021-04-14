package com.example.muslim;

import java.io.Serializable;

public class Alnazeat implements Serializable {
    private String ayat;

    public Alnazeat() {
    }

    public Alnazeat (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
