package com.example.muslim;

import java.io.Serializable;

public class AlfagrEx implements Serializable {
    private String ayat;

    public AlfagrEx() {
    }

    public AlfagrEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
