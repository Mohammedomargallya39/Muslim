package com.example.muslim;

import java.io.Serializable;

public class AlhagrEx implements Serializable {
    private String ayat;

    public AlhagrEx() {
    }

    public AlhagrEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
