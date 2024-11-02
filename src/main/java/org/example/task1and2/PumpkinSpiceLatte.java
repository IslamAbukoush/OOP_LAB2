package org.example.task1and2;

public class PumpkinSpiceLatte extends Cappuccino{
    private Integer mgOfPumpkinSpice;
    public PumpkinSpiceLatte(Intensity intensity, Integer mlOfMilk, Integer mgOfPumpkinSpice) {
        super(intensity, mlOfMilk);
        this.name = "SyrupCappuccino";
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Pumpkin Spice: "+mgOfPumpkinSpice+" mg");
    }
}
