package com.example.muslim;

import java.io.Serializable;

public class Alnabaa implements Serializable {
    private String ayat;

    public Alnabaa() {
    }

    public Alnabaa (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
