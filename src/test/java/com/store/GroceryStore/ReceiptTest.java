package com.store.GroceryStore;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ReceiptTest {
    private MockPrinter mockPrinter;
    Receipt r;
    @BeforeEach
    public  void setup() {
        mockPrinter = new MockPrinter();
        r = new Receipt(mockPrinter);
    }

    @Test
    public void addSingleItem(){

        r.add("Bread", new Money(10, "$"));
        r.print();
        assertEquals(mockPrinter.getActual(),("Bread $10\n"));

    }

    @Test
    public void addmultipleItems(){
        r.add("Bread", new Money(10, "$"));
        r.add("Jam", new Money(7, "$"));
        r.print();

        assertEquals(mockPrinter.getActual(),("Bread $10\nJam $7\n"));

    }

    @Test
    public void correctTotalForMultipleItems(){
        r.add("Bread", new Money(10, "$"));
        r.add("Jam", new Money(7, "$"));
        r.print();
        r.total();

        assertEquals(mockPrinter.getActual(),"Bread $10\nJam $7\n==========\nTOTAL 17");

    }
}
