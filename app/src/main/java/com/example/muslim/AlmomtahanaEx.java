package com.example.muslim;

import java.io.Serializable;

public class AlmomtahanaEx implements Serializable {
    private String ayat;

    public AlmomtahanaEx() {
    }

    public AlmomtahanaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
