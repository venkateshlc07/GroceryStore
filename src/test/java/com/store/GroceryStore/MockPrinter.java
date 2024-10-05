package com.store.GroceryStore;


public class MockPrinter implements Printer {

    StringBuilder text = new StringBuilder();

    @Override
    public void print(String text) {
        this.text.append(text);
    }

    public String getActual() {
        return text.toString();
    }

    @Override
    public void newLine() {
        this.text.append("\n");
    }
}
