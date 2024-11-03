package org.example;

import org.example.tasks.Barista;
public class Main {
    public static void main(String[] args) throws Exception {
        Barista barista = new Barista();
        barista.startShift();
    }
}
