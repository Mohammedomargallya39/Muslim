package com.example.muslim;

import java.io.Serializable;

public class AlmodatherEx implements Serializable {
    private String ayat;

    public AlmodatherEx() {
    }

    public AlmodatherEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
