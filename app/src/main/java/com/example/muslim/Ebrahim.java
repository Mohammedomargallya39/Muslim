package com.example.muslim;

import java.io.Serializable;

public class Ebrahim implements Serializable {
    private String ayat;

    public Ebrahim() {
    }

    public Ebrahim (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
