package org.example.task123;

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

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Milk: "+mlOfMilk+" ml");
    }

    public void makeCappuccino() {
        super.makeCoffee();
        System.out.println("Adding " + mlOfMilk + " mls of milk");
    }
}
