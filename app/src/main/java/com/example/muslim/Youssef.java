package com.example.muslim;

import java.io.Serializable;

public class Youssef implements Serializable {
    private String ayat;

    public Youssef() {
    }

    public Youssef (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
