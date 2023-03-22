package org.src.entities;

public class Broom {
    private Integer speed;

    private String model;

    private Broom() {}

    public Broom(Integer speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
