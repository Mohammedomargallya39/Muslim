package com.example.muslim;

import java.io.Serializable;

public class AlsagdaEx implements Serializable {
    private String ayat;

    public AlsagdaEx() {
    }

    public AlsagdaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
