package com.example.muslim;

import java.io.Serializable;

public class Alfourqan implements Serializable {
    private String ayat;

    public Alfourqan() {
    }

    public Alfourqan (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
