package com.example.muslim;

import java.io.Serializable;

public class YoussefEx implements Serializable {
    private String ayat;

    public YoussefEx() {
    }

    public YoussefEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
