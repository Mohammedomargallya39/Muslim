package com.example.muslim;

import java.io.Serializable;

public class Altghabon implements Serializable {
    private String ayat;

    public Altghabon() {
    }

    public Altghabon (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}

