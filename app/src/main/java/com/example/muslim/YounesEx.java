package com.example.muslim;

import java.io.Serializable;

public class YounesEx implements Serializable {
    private String ayat;

    public YounesEx() {
    }

    public YounesEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
