package com.example.muslim;

import java.io.Serializable;

public class Almodather implements Serializable {
    private String ayat;

    public Almodather() {
    }

    public Almodather (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
