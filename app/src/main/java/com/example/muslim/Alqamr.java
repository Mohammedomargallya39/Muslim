package com.example.muslim;

import java.io.Serializable;

public class Alqamr implements Serializable {
    private String ayat;

    public Alqamr() {
    }

    public Alqamr (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
