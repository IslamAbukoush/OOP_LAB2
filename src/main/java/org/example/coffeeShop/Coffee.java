package org.example.coffeeShop;

import org.example.coffeeShop.enums.Intensity;
import org.example.utilities.ConsoleColors;

class Coffee {
    protected String name;
    private final Intensity coffeeIntensity;

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
        ConsoleColors.setColor(ConsoleColors.ANSI_YELLOW);
        System.out.println("======["+this.name+"]======");
        ConsoleColors.setColor(ConsoleColors.ANSI_RESET);
        System.out.println("Intensity: "+coffeeIntensity);
    }

    public final Coffee makeCoffee() {
        ConsoleColors.setColor(ConsoleColors.ANSI_GREEN);
        System.out.println("▶ Making " + name);
        System.out.println("▶ Intensity is set to " + coffeeIntensity);
        return this;
    }
}
