package com.store.GroceryStore;

public class ConsolePrinter implements Printer {
    public void print(String text) {
        System.out.print(text);
    }

    public void newLine() {
        System.out.println();
    }
}
