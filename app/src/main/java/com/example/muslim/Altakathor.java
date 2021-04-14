package com.example.muslim;

import java.io.Serializable;

public class Altakathor implements Serializable {
    private String ayat;

    public Altakathor() {
    }

    public Altakathor (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}

