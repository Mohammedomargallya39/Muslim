package com.example.muslim;

import java.io.Serializable;

public class Taha implements Serializable {
    private String ayat;

    public Taha() {
    }

    public Taha (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
