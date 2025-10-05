package com.example.dto;

import com.example.property.Color;

public class Apple {
    private Integer weight;
    private Color color;

    public Apple() {

    }

    public Apple(Color color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple " + this.color.name() + "; " + this.weight + ";";
    }

}
