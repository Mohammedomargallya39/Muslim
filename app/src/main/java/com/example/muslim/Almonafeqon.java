package com.example.muslim;

import java.io.Serializable;

public class Almonafeqon implements Serializable {
    private String ayat;

    public Almonafeqon() {
    }

    public Almonafeqon (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}

