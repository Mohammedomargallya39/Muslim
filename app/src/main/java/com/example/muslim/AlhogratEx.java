package com.example.muslim;

import java.io.Serializable;

public class AlhogratEx implements Serializable {
    private String ayat;

    public AlhogratEx() {
    }

    public AlhogratEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
