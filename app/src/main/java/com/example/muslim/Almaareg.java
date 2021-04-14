package com.example.muslim;

import java.io.Serializable;

public class Almaareg implements Serializable {
    private String ayat;

    public Almaareg() {
    }

    public Almaareg (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
