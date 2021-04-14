package com.example.muslim;

import java.io.Serializable;

public class Alwakeaa implements Serializable {
    private String ayat;

    public Alwakeaa() {
    }

    public Alwakeaa (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
