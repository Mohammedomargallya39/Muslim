package com.example.muslim;

import java.io.Serializable;

public class EbrahimEx implements Serializable {
    private String ayat;

    public EbrahimEx() {
    }

    public EbrahimEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
