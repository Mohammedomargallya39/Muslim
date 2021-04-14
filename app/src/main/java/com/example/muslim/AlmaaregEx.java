package com.example.muslim;

import java.io.Serializable;

public class AlmaaregEx implements Serializable {
    private String ayat;

    public AlmaaregEx() {
    }

    public AlmaaregEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
