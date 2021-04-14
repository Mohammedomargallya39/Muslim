package com.example.muslim;

import java.io.Serializable;

public class Alalaq implements Serializable {
    private String ayat;

    public Alalaq() {
    }

    public Alalaq (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
