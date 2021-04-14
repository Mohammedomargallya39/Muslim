package com.example.muslim;

import java.io.Serializable;

public class AlahqafEx implements Serializable {
    private String ayat;

    public AlahqafEx() {
    }

    public AlahqafEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
