package com.example.muslim;

import java.io.Serializable;

public class Altahrim implements Serializable {
    private String ayat;

    public Altahrim() {
    }

    public Altahrim (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}

