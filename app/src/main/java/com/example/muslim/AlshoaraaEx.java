package com.example.muslim;

import java.io.Serializable;

public class AlshoaraaEx implements Serializable {
    private String ayat;

    public AlshoaraaEx() {
    }

    public AlshoaraaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
