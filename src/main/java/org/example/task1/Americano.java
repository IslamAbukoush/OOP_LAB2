package org.example.task1;

public class Americano extends Coffee {
    private final Integer mlOfWater;

    public Americano(Intensity intensity, Integer mlOfWater) {
        super(intensity);
        this.name = "Americano";
        this.mlOfWater = mlOfWater;
    }

    public Integer getMlOfWater() {
        return mlOfWater;
    }
}