package com.example.muslim;

import java.io.Serializable;

public class AlgenEx implements Serializable {
    private String ayat;

    public AlgenEx() {
    }

    public AlgenEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
