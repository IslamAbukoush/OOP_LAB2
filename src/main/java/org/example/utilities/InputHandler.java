package org.example.utilities;
import java.util.Scanner;

public class InputHandler {
    public static int getIntInRange(int min, int max) throws Exception {
        int input = Integer.parseInt(getInput());
        System.out.println();
        if(input >= min && input <= max) {
            return input;
        }
        throw new Exception("Invalid input");
    }
    public static String getInput() {
        ConsoleColors.setColor(ConsoleColors.ANSI_RESET);
        System.out.print("▶ Your choice: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static int getChoice(String note, String[] list) throws Exception {
        ConsoleColors.setColor(ConsoleColors.ANSI_YELLOW);
        System.out.println(note);
        printMenu(list);
        String input = getInput();
        System.out.println();
        return validateInput(input, list.length)-1;
    }
    public static void printMenu(String[] list) {
        for(int i = 0; i < list.length; i++) {
            System.out.println(ConsoleColors.ANSI_BLUE+(i+1)+": "+ConsoleColors.ANSI_RESET+list[i]);
        }
        ConsoleColors.setColor(ConsoleColors.ANSI_RESET);
    }
    private static int validateInput(String input, int max) throws Exception {
        int inputInt;
        try {
            inputInt = Integer.parseInt(input);
        } catch (Exception e) {
            throw new Exception("Invalid input!");
        }
        if(inputInt >= 1 && inputInt <= max) {
            return inputInt;
        }
        throw new Exception("Invalid input");
    }
}
