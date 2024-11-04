package org.example.coffeeShop;

import org.example.utilities.ConsoleColors;

import java.util.List;

public class Barista {
    public void makeDrinks(List<Object> orders) throws Exception {
        for(Object order : orders) {
            System.out.println("\n");
            if(order.getClass() == Coffee.class) {
                ((Coffee) order).printDetails();
                ((Coffee) order).makeCoffee();
            } else if(order.getClass() == Americano.class) {
                ((Americano) order).printDetails();
                ((Americano) order).makeAmericano();
            } else if(order.getClass() == Cappuccino.class) {
                ((Cappuccino) order).printDetails();
                ((Cappuccino) order).makeCappuccino();
            } else if(order.getClass() == SyrupCappuccino.class) {
                ((SyrupCappuccino) order).printDetails();
                ((SyrupCappuccino) order).makeSyrupCappuccino();
            } else if(order.getClass() == PumpkinSpiceLatte.class) {
                ((PumpkinSpiceLatte) order).printDetails();
                ((PumpkinSpiceLatte) order).makePumpkinSpiceLatte();
            } else {
                throw new Exception("Unknown class of drinks provided to the barista.");
            }
            ConsoleColors.setColor(ConsoleColors.ANSI_RESET);
            System.out.println("Drink is ready!");
        }
        ConsoleColors.setColor(ConsoleColors.ANSI_BLUE);
        System.out.println("\nEnjoy your drinks!");
    }
}
