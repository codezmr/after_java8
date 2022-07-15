package com.codezmr.interface_enhancement.predicate.stockSearch;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Trading {
	
	
	static ArrayList<Stock> stocks = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		Stock stockToSearch = new Stock("ITC", 3800, 168);
		
		stocks.add(new Stock("Apple", 500, 20));
		stocks.add(new Stock("Asus", 20000, 3));
		stocks.add(new Stock("ITC", 3800, 168));
		
		
		Predicate<Stock> stockEquality = Predicate.isEqual(stockToSearch);
		
		for(Stock s : stocks) {
			
			if(stockEquality.test(s)) {
				
				System.out.println("Stock found: "+ s);
			}
			
			
		}
	}
}
