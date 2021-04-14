package com.example.muslim;

import java.io.Serializable;

public class AlmotafefenEx implements Serializable {
    private String ayat;

    public AlmotafefenEx() {
    }

    public AlmotafefenEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
