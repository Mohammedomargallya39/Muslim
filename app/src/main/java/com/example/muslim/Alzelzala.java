package com.example.muslim;

import java.io.Serializable;

public class Alzelzala implements Serializable {
    private String ayat;

    public Alzelzala() {
    }

    public Alzelzala (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
