package com.example.muslim;

import java.io.Serializable;

public class Loqman implements Serializable {
    private String ayat;

    public Loqman() {
    }

    public Loqman (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
