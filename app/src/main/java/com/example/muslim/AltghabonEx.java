package com.example.muslim;

import java.io.Serializable;

public class AltghabonEx implements Serializable {
    private String ayat;

    public AltghabonEx() {
    }

    public AltghabonEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
