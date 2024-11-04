package org.example.coffeeShop;

import org.example.coffeeShop.enums.Intensity;
import org.example.coffeeShop.enums.SyrupType;
import org.example.utilities.ConsoleColors;

import java.util.ArrayList;
import java.util.List;

import static org.example.utilities.InputHandler.getChoice;
import static org.example.utilities.InputHandler.getIntInRange;

public class Waiter {
    private final String[] drinks = {"Coffee", "Americano", "Cappuccino", "Pumpkin Spice Latte", "Syrup Cappuccino"};
    private final String[] intensities = {"Strong", "Normal", "Light"};
    private final String[] syrups = {"Macadamia", "Vanilla", "Coconut", "Caramel", "Chocolate", "Popcorn"};
    private final List<Object> orders = new ArrayList<Object>();

    public List<Object> getOrders() throws Exception {
        ConsoleColors.setColor(ConsoleColors.ANSI_GREEN);
        System.out.println("=========<<Welcome!>>=========");
        System.out.println("OOP 2nd lab by Islam Abu koush\n");
        do {
            int drinkIndex = getChoice("Please choose a drink: ", drinks);
            orders.add(makeOrder(drinkIndex));
        } while (wantsMore());
        return orders;
    }

    public Object makeOrder(int index) throws Exception {
        ConsoleColors.setColor(ConsoleColors.ANSI_RESET);
        return switch (index) {
            case 0 -> handleCoffee();
            case 1 -> handleAmericano();
            case 2 -> handleCappuccino();
            case 3 -> handlePumpkinSpiceLatte();
            default -> handleSyrupCappuccino();
        };
    }
    private boolean wantsMore() throws Exception {
        ConsoleColors.setColor(ConsoleColors.ANSI_RESET);
        int answer = getChoice("Anything else?", new String[]{ConsoleColors.ANSI_RED+"No", ConsoleColors.ANSI_GREEN+"Yes"});
        return answer == 1;
    }
    private Object handleCoffee() throws Exception {
        Intensity intensity = promptIntensity();
        return new Coffee(intensity);
    }
    private Object handleCappuccino() throws Exception {
        Intensity intensity = promptIntensity();
        int mlOfMilk = promptQuantity("milk", "ml");
        return new Cappuccino(intensity, mlOfMilk);
    }
    private Object handlePumpkinSpiceLatte() throws Exception {
        Intensity intensity = promptIntensity();
        int mlOfMilk = promptQuantity("milk", "ml");
        int mgOfPumpkinSpice = promptQuantity("pumpkin spice", "mg");
        return new PumpkinSpiceLatte(intensity, mlOfMilk, mgOfPumpkinSpice);
    }
    private Object handleSyrupCappuccino() throws Exception {
        Intensity intensity = promptIntensity();
        int mlOfMilk = promptQuantity("milk", "ml");
        SyrupType syrup = promptSyrup();
        return new SyrupCappuccino(intensity, mlOfMilk, syrup);
    }

    private Object handleAmericano() throws Exception {
        Intensity intensity = promptIntensity();
        int mlOfWater = promptQuantity("water", "ml");
        return new Americano(intensity, mlOfWater);
    }
    private Intensity promptIntensity() throws Exception {
        int index = getChoice("Choose intensity: ", intensities);
        return switch (index) {
            case 0 -> Intensity.STRONG;
            case 1 -> Intensity.NORMAL;
            default -> Intensity.LIGHT;
        };
    }
    private SyrupType promptSyrup() throws Exception {
        int index = getChoice("Choose syrup: ", syrups);
        return switch (index) {
            case 0 -> SyrupType.MACADAMIA;
            case 1 -> SyrupType.VANILLA;
            case 2 -> SyrupType.COCONUT;
            case 3 -> SyrupType.CARAMEL;
            case 4 -> SyrupType.CHOCOLATE;
            default -> SyrupType.POPCORN;
        };
    }
    private int promptQuantity(String thing, String unit) throws Exception {
        System.out.println("Enter "+unit+"s of "+thing+": ");
        return getIntInRange(0, 1000);
    }
}
