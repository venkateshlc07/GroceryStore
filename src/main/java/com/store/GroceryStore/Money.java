package com.store.GroceryStore;

public class Money {
    private int amount;
    private String currency;
    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public void print(Printer p) {
        p.print(currency);
        p.print(String.valueOf(amount));

    }

    public void shareTo(ReceiptMetrics receiptMetrics) {
        receiptMetrics.add(amount);
    }
}

