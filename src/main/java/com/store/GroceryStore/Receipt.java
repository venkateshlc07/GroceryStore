package com.store.GroceryStore;

import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private final Printer printer;
    private final List<Item> items;

    public Receipt(Printer p){
        this.printer = p;
        items = new ArrayList<>();
    }
    public void add(String itemName, int qty, Money amount){
        items.add(new Item(itemName, qty, amount));
    }

    public void print(){
        items.forEach(item -> item.print(printer));
    }

    public void total(){
        ReceiptMetrics metrics = new ReceiptMetrics();
        for(Item item: items){
            item.shareTo(metrics);
        }
        metrics.print(printer);

    }
}
