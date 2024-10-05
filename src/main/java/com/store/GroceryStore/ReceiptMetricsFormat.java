package com.store.GroceryStore;

public class ReceiptMetricsFormat {
    public void print(int total, Printer p){
        p.print("==========");
        p.newLine();
        p.print("TOTAL ");
        p.print(String.valueOf(total));
    }
}