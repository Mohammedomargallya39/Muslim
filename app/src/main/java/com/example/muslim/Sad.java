package com.example.muslim;

import java.io.Serializable;

public class Sad implements Serializable {
    private String ayat;

    public Sad() {
    }

    public Sad (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
