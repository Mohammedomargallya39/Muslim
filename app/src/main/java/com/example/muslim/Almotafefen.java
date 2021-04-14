package com.example.muslim;

import java.io.Serializable;

public class Almotafefen implements Serializable {
    private String ayat;

    public Almotafefen() {
    }

    public Almotafefen (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}

