package com.example.muslim;

import java.io.Serializable;

public class AltalaqEx implements Serializable {
    private String ayat;

    public AltalaqEx() {
    }

    public AltalaqEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
