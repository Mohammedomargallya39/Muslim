package com.example.muslim;

import java.io.Serializable;

public class AlahzabEx implements Serializable {
    private String ayat;

    public AlahzabEx() {
    }

    public AlahzabEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
