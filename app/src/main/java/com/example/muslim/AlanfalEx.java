package com.example.muslim;

import java.io.Serializable;

public class AlanfalEx implements Serializable {
    private String ayat;

    public AlanfalEx() {
    }

    public AlanfalEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
