package com.example.muslim;

import java.io.Serializable;

public class Almozamel implements Serializable {
    private String ayat;

    public Almozamel() {
    }

    public Almozamel (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
