package com.store.GroceryStore;

public class ItemFormat {
    private String name;

    private int qty;
    private Money amount;

    public ItemFormat(String name, int qty, Money amount){
        this.name = name;
        this.qty = qty;
        this.amount = amount;
    }

    public void print(Printer p){
        p.print(name);
        p.print(" ");
        p.print(String.valueOf(qty));
        p.print(" ");
        amount.print(p);
        p.newLine();
    }
}
