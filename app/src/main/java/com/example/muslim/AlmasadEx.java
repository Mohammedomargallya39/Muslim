package com.example.muslim;

import java.io.Serializable;

public class AlmasadEx implements Serializable {
    private String ayat;

    public AlmasadEx() {
    }

    public AlmasadEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}




