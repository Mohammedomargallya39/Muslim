package com.example.muslim;

import java.io.Serializable;

public class Altakwer implements Serializable {
    private String ayat;

    public Altakwer() {
    }

    public Altakwer (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
