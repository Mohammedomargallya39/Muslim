package com.example.muslim;

import java.io.Serializable;

public class YacenEx implements Serializable {
    private String ayat;

    public YacenEx() {
    }

    public YacenEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
