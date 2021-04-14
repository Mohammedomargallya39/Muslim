package com.example.muslim;

import java.io.Serializable;

public class AlemranEx implements Serializable {
    private String ayat;

    public AlemranEx() {
    }

    public AlemranEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
