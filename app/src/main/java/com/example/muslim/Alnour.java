package com.example.muslim;

import java.io.Serializable;

public class Alnour implements Serializable {
    private String ayat;

    public Alnour() {
    }

    public Alnour (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
