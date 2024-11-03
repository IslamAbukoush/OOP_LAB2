package org.example.tasks;

import java.util.Scanner;

public class InputHandler {
    public static int getIntInRange(int min, int max) throws Exception {
        int input = Integer.parseInt(getInput());
        if(input >= min && input <= max) {
            return input;
        }
        throw new Exception("Invalid input");
    }
    public static String getInput() {
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static int getChoice(String note, String[] list) throws Exception {
        System.out.println(note);
        printMenu(list);
        String input = getInput();
        return validateInput(input, list.length)-1;
    }
    public static void printMenu(String[] list) {
        for(int i = 0; i < list.length; i++) {
            System.out.println((i+1)+" "+list[i]);
        }
    }
    private static int validateInput(String input, int max) throws Exception {
        int inputInt = Integer.parseInt(input);
        if(inputInt >= 1 && inputInt <= max) {
            return inputInt;
        }
        throw new Exception("Invalid input");
    }
}
