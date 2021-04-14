package com.example.muslim;

import java.io.Serializable;

public class Albaiena implements Serializable {
    private String ayat;

    public Albaiena() {
    }

    public Albaiena (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}

