package com.example.muslim;

import java.io.Serializable;

public class Alrahman implements Serializable {
    private String ayat;

    public Alrahman() {
    }

    public Alrahman (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
