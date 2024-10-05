package com.store.GroceryStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroceryStoreApplication {
   //main
	public static void main(String[] args) {
		Receipt r = new Receipt(new ConsolePrinter());
		r.add("Cookies", 2, new Money(5, "$"));
		r.add("Jam", 1, new Money(5, "$"));
		r.add("Cookies", 1, new Money(5, "$"));

		r.print();
		r.total();
	}

}
