package org.example.task1;

public class Cappuccino extends Coffee {
    private final Integer mlOfMilk;

    public Cappuccino(Intensity intensity, Integer mlOfMilk) {
        super(intensity); // Call Coffee constructor
        this.name = "Cappuccino"; // Override name
        this.mlOfMilk = mlOfMilk;
    }

    public Integer getMlOfMilk() {
        return mlOfMilk;
    }
}
