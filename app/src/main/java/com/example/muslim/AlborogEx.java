package com.example.muslim;

import java.io.Serializable;

public class AlborogEx implements Serializable {
    private String ayat;

    public AlborogEx() {
    }

    public AlborogEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
