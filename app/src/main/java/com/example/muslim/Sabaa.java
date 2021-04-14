package com.example.muslim;

import java.io.Serializable;

public class Sabaa implements Serializable {
    private String ayat;

    public Sabaa() {
    }

    public Sabaa (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
