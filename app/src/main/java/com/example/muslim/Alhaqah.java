package com.example.muslim;

import java.io.Serializable;

public class Alhaqah implements Serializable {
    private String ayat;

    public Alhaqah() {
    }

    public Alhaqah (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
