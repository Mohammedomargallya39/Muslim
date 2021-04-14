package com.example.muslim;

import java.io.Serializable;

public class Younes implements Serializable {
    private String ayat;

    public Younes() {
    }

    public Younes (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
