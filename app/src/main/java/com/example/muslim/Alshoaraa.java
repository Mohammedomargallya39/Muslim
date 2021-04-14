package com.example.muslim;

import java.io.Serializable;

public class Alshoaraa implements Serializable {
    private String ayat;

    public Alshoaraa() {
    }

    public Alshoaraa (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
