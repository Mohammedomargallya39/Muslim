package com.example.muslim;

import java.io.Serializable;

public class AlekhlasEx implements Serializable {
    private String ayat;

    public AlekhlasEx() {
    }

    public AlekhlasEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}




