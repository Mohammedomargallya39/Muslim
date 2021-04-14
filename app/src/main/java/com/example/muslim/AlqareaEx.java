package com.example.muslim;

import java.io.Serializable;

public class AlqareaEx implements Serializable {
    private String ayat;

    public AlqareaEx() {
    }

    public AlqareaEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}




