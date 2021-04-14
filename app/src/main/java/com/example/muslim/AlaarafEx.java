package com.example.muslim;

import java.io.Serializable;

public class AlaarafEx implements Serializable {
    private String ayat;

    public AlaarafEx() {
    }

    public AlaarafEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
