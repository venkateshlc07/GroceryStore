package com.store.GroceryStore;

public class ReceiptMetrics {
    private int total;
    public void add(int qty, int amount) {
        total += (qty * amount);
    }

   public int getTotal(){
        return total;
    }

    public void print(Printer p){
        new ReceiptMetricsFormat().print(total, p);
    }
}
