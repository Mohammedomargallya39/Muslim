package com.example.muslim;

        import java.io.Serializable;

public class AlbaqarahEx implements Serializable {
    private String ayat;

    public AlbaqarahEx() {
    }

    public AlbaqarahEx (String ayat) {
        this.ayat = ayat;
    }

    public String getAyat() {
        return ayat;
    }

    public void setAyat(String ayat) {
        this.ayat = ayat;
    }
}




