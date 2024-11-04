package org.example;

import org.example.coffeeShop.Barista;
import org.example.coffeeShop.Waiter;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Waiter waiter = new Waiter();
        Barista barista = new Barista();

        List<Object> orders = waiter.getOrders();
        barista.makeDrinks(orders);
    }
}
