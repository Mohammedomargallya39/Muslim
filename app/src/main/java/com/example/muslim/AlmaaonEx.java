package com.example.muslim;

import java.io.Serializable;

public class AlmaaonEx implements Serializable {
    private String ayat;

    public AlmaaonEx() {
    }

    public AlmaaonEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}




