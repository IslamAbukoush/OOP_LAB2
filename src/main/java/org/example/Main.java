package org.example;

import org.example.task1.Cappuccino;
import org.example.task1.Coffee;
import org.example.task1.SyrupCappuccino;

public class Main {
    public static void main(String[] args) {
        Cappuccino myCappuccino = new Cappuccino(Coffee.Intensity.NORMAL, 150);
        System.out.println("Your coffee: " + myCappuccino.getName());
        System.out.println("Intensity: " + myCappuccino.getCoffeeIntensity());
        System.out.println("Milk in ml: " + myCappuccino.getMlOfMilk());

        SyrupCappuccino mySyrupCappuccino = new SyrupCappuccino(Coffee.Intensity.STRONG, 100, SyrupCappuccino.SyrupType.CARAMEL);
    }
}
