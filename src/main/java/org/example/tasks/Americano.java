package org.example.tasks;

class Americano extends Coffee {
    private final Integer mlOfWater;

    public Americano(Intensity intensity, Integer mlOfWater) {
        super(intensity);
        this.name = "Americano";
        this.mlOfWater = mlOfWater;
    }

    public Integer getMlOfWater() {
        return mlOfWater;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Water: " + mlOfWater + " ml");
    }

    public final Americano makeAmericano() {
        super.makeCoffee();
        System.out.println("▶ Adding " + mlOfWater + " mls of water");
        return this;
    }
}