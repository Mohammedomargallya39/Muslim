package com.example.muslim;

import java.io.Serializable;

public class AlqalamEx implements Serializable {
    private String ayat;

    public AlqalamEx() {
    }

    public AlqalamEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
