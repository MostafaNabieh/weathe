package com.example.weather;

public class mode {
    private String description;
    private String speend,h;
    public mode(String description, String speend, String h) {
        this.description = description;
        this.speend = speend;
        this.h = h;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpeend() {
        return speend;
    }

    public void setSpeend(String speend) {
        this.speend = speend;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }
}
