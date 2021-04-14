package com.example.muslim;

import java.io.Serializable;

public class Elkahf implements Serializable {
    private String ayat;

    public Elkahf() {
    }

    public Elkahf (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
