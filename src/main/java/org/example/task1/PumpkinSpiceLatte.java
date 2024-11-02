package org.example.task1;

public class PumpkinSpiceLatte extends Cappuccino{
    private Integer mgOfPumpkinSpice;
    public PumpkinSpiceLatte(Intensity intensity, Integer mlOfMilk, Integer mgOfPumpkinSpice) {
        super(intensity, mlOfMilk);
        this.name = "SyrupCappuccino";
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }
}
