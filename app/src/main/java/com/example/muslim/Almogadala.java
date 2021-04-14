package com.example.muslim;

import java.io.Serializable;

public class Almogadala implements Serializable {
    private String ayat;

    public Almogadala() {
    }

    public Almogadala (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
