package com.example.muslim;

import java.io.Serializable;

public class MohammedEx implements Serializable {
    private String ayat;

    public MohammedEx() {
    }

    public MohammedEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
