package com.example.muslim;

import java.io.Serializable;

public class Altarek implements Serializable {
    private String ayat;

    public Altarek() {
    }

    public Altarek (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
