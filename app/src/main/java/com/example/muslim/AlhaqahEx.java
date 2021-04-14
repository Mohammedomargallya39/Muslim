package com.example.muslim;

import java.io.Serializable;

public class AlhaqahEx implements Serializable {
    private String ayat;

    public AlhaqahEx() {
    }

    public AlhaqahEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
