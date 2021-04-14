package com.example.muslim;

import java.io.Serializable;

public class AlnabaaEx implements Serializable {
    private String ayat;

    public AlnabaaEx() {
    }

    public AlnabaaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
