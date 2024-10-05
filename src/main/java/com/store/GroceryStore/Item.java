package com.store.GroceryStore;


public class Item {
    private String name;
    private Money amount;

    public Item(String name, Money amount){
        this.name = name;
        this.amount = amount;

    }

    public void print(Printer p){
        /*
        p.print(name);
        p.print(" ");
        amount.print(p);
        p.newLine();
         */
        new ItemFormat(name, amount).print(p);
    }

    public void shareTo(ReceiptMetrics receiptMetrics) {
        amount.shareTo(receiptMetrics);
    }
}
