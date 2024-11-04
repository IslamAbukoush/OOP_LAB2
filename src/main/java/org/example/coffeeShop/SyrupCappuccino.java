package org.example.coffeeShop;

import org.example.coffeeShop.enums.Intensity;
import org.example.coffeeShop.enums.SyrupType;

class SyrupCappuccino extends Cappuccino{
    private final SyrupType syrup;
    public SyrupCappuccino(Intensity intensity, Integer mlOfMilk, SyrupType syrup) {
        super(intensity, mlOfMilk);
        this.name = "SyrupCappuccino";
        this.syrup = syrup;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Syrup: "+syrup);
    }

    public final SyrupCappuccino makeSyrupCappuccino() {
        super.makeCappuccino();
        System.out.println("▶ Adding " + syrup + " syrup");
        return this;
    }
}
