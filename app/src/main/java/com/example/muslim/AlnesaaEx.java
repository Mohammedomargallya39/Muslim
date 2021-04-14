package com.example.muslim;

import java.io.Serializable;

public class AlnesaaEx implements Serializable {
    private String ayat;

    public AlnesaaEx() {
    }

    public AlnesaaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
