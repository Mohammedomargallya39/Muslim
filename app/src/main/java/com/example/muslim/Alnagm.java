package com.example.muslim;

import java.io.Serializable;

public class Alnagm implements Serializable {
    private String ayat;

    public Alnagm() {
    }

    public Alnagm (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
