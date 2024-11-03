package org.example.tasks;

import static org.example.tasks.InputHandler.getChoice;
import static org.example.tasks.InputHandler.getIntInRange;

public class Barista {
    private final String[] drinks = {"Coffee", "Americano", "Cappuccino", "Pumpkin Spice Latte", "Syrup Cappuccino"};
    private final String[] intensities = {"Strong", "Normal", "Light"};
    private final String[] syrups = {"Macadamia", "Vanilla", "Coconut", "Caramel", "Chocolate", "Popcorn"};

    public void startShift() throws Exception {
        System.out.println("Welcome!");
        do {
            int drinkIndex = getChoice("Please choose a drink: ", drinks);
            makeDrink(drinkIndex);
            System.out.println("\n Enjoy your drink!");
        } while (wantsMore());
        System.out.println("Come back later!");
    }
    public void makeDrink(int index) throws Exception {
        switch (index) {
            case 0:
                handleCoffee();
                break;
            case 1:
                handleAmericano();
                break;
            case 2:
                handleCappuccino();
                break;
            case 3:
                handlePumpkinSpiceLatte();
                break;
            default:
                handleSyrupCappuccino();
        }
    }
    private void handleCoffee() throws Exception {
        Coffee.Intensity intensity = promptIntensity();
        Coffee coffee = new Coffee(intensity);
        coffee.printDetails();
        coffee.makeCoffee();
    }
    private void handleCappuccino() throws Exception {
        Coffee.Intensity intensity = promptIntensity();
        int mlOfMilk = promptQuantity("milk", "ml");
        Cappuccino cappuccino = new Cappuccino(intensity, mlOfMilk);
        cappuccino.printDetails();
        cappuccino.makeCappuccino();
    }
    private void handlePumpkinSpiceLatte() throws Exception {
        Coffee.Intensity intensity = promptIntensity();
        int mlOfMilk = promptQuantity("milk", "ml");
        int mgOfPumpkinSpice = promptQuantity("pumpkin spice", "mg");
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(intensity, mlOfMilk, mgOfPumpkinSpice);
        pumpkinSpiceLatte.printDetails();
        pumpkinSpiceLatte.makePumpkinSpiceLatte();
    }
    private void handleSyrupCappuccino() throws Exception {
        Coffee.Intensity intensity = promptIntensity();
        int mlOfMilk = promptQuantity("milk", "ml");
        SyrupCappuccino.SyrupType syrup = promptSyrup();
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(intensity, mlOfMilk, syrup);
        syrupCappuccino.printDetails();
        syrupCappuccino.makeSyrupCappuccino();
    }
    private void handleAmericano() throws Exception {
        Coffee.Intensity intensity = promptIntensity();
        int mlOfWater = promptQuantity("water", "ml");
        Americano americano = new Americano(intensity, mlOfWater);
        americano.printDetails();
        americano.makeAmericano();
    }

    private Coffee.Intensity promptIntensity() throws Exception {
        int index = getChoice("Choose intensity: ", intensities);
        return switch (index) {
            case 0 -> Coffee.Intensity.STRONG;
            case 1 -> Coffee.Intensity.NORMAL;
            default -> Coffee.Intensity.LIGHT;
        };
    }
    private SyrupCappuccino.SyrupType promptSyrup() throws Exception {
        int index = getChoice("Choose syrup: ", syrups);
        return switch (index) {
            case 0 -> SyrupCappuccino.SyrupType.MACADAMIA;
            case 1 -> SyrupCappuccino.SyrupType.VANILLA;
            case 2 -> SyrupCappuccino.SyrupType.COCONUT;
            case 3 -> SyrupCappuccino.SyrupType.CARAMEL;
            case 4 -> SyrupCappuccino.SyrupType.CHOCOLATE;
            default -> SyrupCappuccino.SyrupType.POPCORN;
        };
    }
    private int promptQuantity(String thing, String unit) throws Exception {
        System.out.println("Enter "+unit+"s of "+thing+": ");
        return getIntInRange(0, 1000);
    }
    private boolean wantsMore() throws Exception {
        int answer = getChoice("Need anything else?", new String[]{"No", "Yes"});
        return answer == 1;
    }
}
