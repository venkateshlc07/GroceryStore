package com.store.GroceryStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroceryStoreApplication {

	public static void main(String[] args) {
		Receipt r = new Receipt(new ConsolePrinter());
		r.add("Cookies", new Money(5, "$"));
		r.add("Jam", new Money(5, "$"));
		r.add("Cookies", new Money(5, "$"));

		r.print();
		r.total();
	}

}
