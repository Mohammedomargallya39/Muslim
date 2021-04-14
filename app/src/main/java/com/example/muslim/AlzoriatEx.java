package com.example.muslim;

import java.io.Serializable;

public class AlzoriatEx implements Serializable {
    private String ayat;

    public AlzoriatEx() {
    }

    public AlzoriatEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
