package com.example.muslim;

import java.io.Serializable;

public class QoraishEx implements Serializable {
    private String ayat;

    public QoraishEx() {
    }

    public QoraishEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}




