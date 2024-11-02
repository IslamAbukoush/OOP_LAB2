package org.example.task1;

public class Coffee {
    String name;
    Intensity coffeeIntensity;

    public enum Intensity {
        LIGHT,
        NORMAL,
        STRONG
    }

    public Coffee(Intensity coffeeIntensity) {
        this.name = "Coffee";
        this.coffeeIntensity = coffeeIntensity;
    }

    // Getter for coffeeIntensity
    public Intensity getCoffeeIntensity() {
        return coffeeIntensity;
    }

    public String getName() {
        return name;
    }
}
