package org.example;

import org.example.task123.Cappuccino;
import org.example.task123.Coffee;
import org.example.task123.SyrupCappuccino;

public class Main {
    public static void main(String[] args) {
        Cappuccino myCappuccino = new Cappuccino(Coffee.Intensity.NORMAL, 150);
        SyrupCappuccino mySyrupCappuccino = new SyrupCappuccino(Coffee.Intensity.STRONG, 100, SyrupCappuccino.SyrupType.CARAMEL);
        myCappuccino.printDetails();
        mySyrupCappuccino.printDetails();
        myCappuccino.makeCappuccino();
        mySyrupCappuccino.makeSyrupCappuccino();
    }
}
