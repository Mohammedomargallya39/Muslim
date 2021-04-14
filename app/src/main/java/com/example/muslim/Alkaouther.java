package com.example.muslim;

import java.io.Serializable;

public class Alkaouther implements Serializable {
    private String ayat;

    public Alkaouther() {
    }

    public Alkaouther (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
