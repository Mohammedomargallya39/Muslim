package com.example.muslim;

import java.io.Serializable;

public class QafEx implements Serializable {
    private String ayat;

    public QafEx() {
    }

    public QafEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
