package com.example.muslim;

import java.io.Serializable;

public class Alaala implements Serializable {
    private String ayat;

    public Alaala() {
    }

    public Alaala (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
