package com.example.muslim;

import java.io.Serializable;

public class GhaferEx implements Serializable {
    private String ayat;

    public GhaferEx() {
    }

    public GhaferEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
