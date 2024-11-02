package org.example.task123;

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

    public void printDetails() {
        System.out.println("======["+this.name+"]======");
        System.out.println("Intensity: "+coffeeIntensity);
    }

    public void makeCoffee() {
        System.out.println("Making " + name);
        System.out.println("Intensity is set to " + coffeeIntensity);
    }
}
