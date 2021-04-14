package com.example.muslim;

import java.io.Serializable;

public class AlfelEx implements Serializable {
    private String ayat;

    public AlfelEx() {
    }

    public AlfelEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}




