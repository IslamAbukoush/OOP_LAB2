package org.example.task1;

public class SyrupCappuccino extends Cappuccino{
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
}
