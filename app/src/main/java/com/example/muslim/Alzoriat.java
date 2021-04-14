package com.example.muslim;

import java.io.Serializable;

public class Alzoriat implements Serializable {
    private String ayat;

    public Alzoriat() {
    }

    public Alzoriat (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
