package com.example.muslim;

import java.io.Serializable;

public class AltenEx implements Serializable {
    private String ayat;

    public AltenEx() {
    }

    public AltenEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
