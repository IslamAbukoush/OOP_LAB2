package org.example.tasks;

class SyrupCappuccino extends Cappuccino{
    protected SyrupType syrup;
    public enum SyrupType {
        MACADAMIA,
        VANILLA,
        COCONUT,
        CARAMEL,
        CHOCOLATE,
        POPCORN
    }
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
