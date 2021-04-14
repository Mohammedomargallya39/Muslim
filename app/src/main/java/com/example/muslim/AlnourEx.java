package com.example.muslim;

import java.io.Serializable;

public class AlnourEx implements Serializable {
    private String ayat;

    public AlnourEx() {
    }

    public AlnourEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
