package com.store.GroceryStore;

public class ItemFormat {
    private String name;
    private Money amount;
    public ItemFormat(String name, Money amount){
        this.name = name;
        this.amount = amount;
    }

    public void print(Printer p){
        p.print(name);
        p.print(" ");
        amount.print(p);
        p.newLine();
    }
}
