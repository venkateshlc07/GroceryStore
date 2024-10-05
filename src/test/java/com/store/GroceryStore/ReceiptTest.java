package com.store.GroceryStore;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ReceiptTest {
    MockPrinter mockPrinter;

    public ReceiptTest(){
        this.mockPrinter = new MockPrinter();
    }

    @Test
    public void addSingleItem(){
        Receipt r = new Receipt(mockPrinter);
        r.add("Bread", new Money(10, "$"));
        r.print();
        assertEquals(mockPrinter.getActual(),("Bread $10\n"));

    }

    @Test
    public void addmultipleItems(){
        Receipt r = new Receipt(mockPrinter);
        r.add("Bread", new Money(10, "$"));
        r.add("Jam", new Money(7, "$"));
        r.print();

        assertEquals(mockPrinter.getActual(),("Bread $10\nJam $7\n"));

    }
}
