package org.src.entities;

public class Wand {
    private Double length;
    private String woodType;

    public Wand(){}

    public Wand(Double length, String woodType) {
        this.length = length;
        this.woodType = woodType;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }
}
