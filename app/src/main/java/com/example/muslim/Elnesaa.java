package com.example.muslim;

import java.io.Serializable;

public class Elnesaa implements Serializable {
    private String ayat;

    public Elnesaa() {
    }

    public Elnesaa (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
