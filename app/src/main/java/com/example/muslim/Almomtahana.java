package com.example.muslim;

import java.io.Serializable;

public class Almomtahana implements Serializable {
    private String ayat;

    public Almomtahana() {
    }

    public Almomtahana (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
