package com.example.muslim;

import java.io.Serializable;

public class Alahzab implements Serializable {
    private String ayat;

    public Alahzab() {
    }

    public Alahzab (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
