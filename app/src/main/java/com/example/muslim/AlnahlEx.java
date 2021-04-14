package com.example.muslim;

import java.io.Serializable;

public class AlnahlEx implements Serializable {
    private String ayat;

    public AlnahlEx() {
    }

    public AlnahlEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
