package com.example.muslim;

import java.io.Serializable;

public class AlkahfEx implements Serializable {
    private String ayat;

    public AlkahfEx() {
    }

    public AlkahfEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
