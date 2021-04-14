package com.example.muslim;

import java.io.Serializable;

public class AlmoemenonEx implements Serializable {
    private String ayat;

    public AlmoemenonEx() {
    }

    public AlmoemenonEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}

