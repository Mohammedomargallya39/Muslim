package com.example.muslim;

import java.io.Serializable;

public class Alsharh implements Serializable {
    private String ayat;

    public Alsharh() {
    }

    public Alsharh (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
