package streamsPkg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilter {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Bananas");
		fruits.add("Apple");
		fruits.add("Kiwi");
		fruits.add("Papayas");
		fruits.add("Grapes");

		// find only those fruits whose length is greater than 5.

		System.out.println("Length of Fruits are : " 
				+ fruits.stream().map(f -> f.length()).collect(Collectors.toList()));
		
		System.out.println("Fruits whose length is greater than 5 : "
				+ fruits.stream().filter(f -> f.length() > 5).collect(Collectors.toList()));
		
		System.out.println("Length of fruits whose length is greater than 5 : "
				+ fruits.stream().filter(f -> f.length() > 5).map(l -> l.length()).collect(Collectors.toList()));

	}

}
