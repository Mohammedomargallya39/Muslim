package com.example.muslim;

import java.io.Serializable;

public class AlroomEx implements Serializable {
    private String ayat;

    public AlroomEx() {
    }

    public AlroomEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}
