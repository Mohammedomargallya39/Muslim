package com.example.muslim;

import java.io.Serializable;

public class Alhograt implements Serializable {
    private String ayat;

    public Alhograt() {
    }

    public Alhograt (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
