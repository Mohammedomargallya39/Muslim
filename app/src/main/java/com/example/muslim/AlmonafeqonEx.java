package com.example.muslim;

import java.io.Serializable;

public class AlmonafeqonEx implements Serializable {
    private String ayat;

    public AlmonafeqonEx() {
    }

    public AlmonafeqonEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}

