package com.store.GroceryStore;


public class Item {
    private String name;
    private Money amount;
    private int qty;

    public Item(String name, int qty, Money amount){
        this.name = name;
        this.qty = qty;
        this.amount = amount;
    }

    public void print(Printer p){
        /*
        p.print(name);
        p.print(" ");
        amount.print(p);
        p.newLine();
         */
        new ItemFormat(name, qty, amount).print(p);
    }

    public void shareTo(ReceiptMetrics receiptMetrics) {
        amount.shareTo(qty,receiptMetrics);
    }
}
