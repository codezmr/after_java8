package streamsPkg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilter {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Kiwi");
		fruits.add("Papaya");
		fruits.add("Grapes");
		
		//find only those fruits whose length is greater than 5.
		
		System.out.println(fruits.stream().map(f -> f.length()).collect(Collectors.toList()));
		System.out.println(fruits.stream().filter(f -> f.length() > 5).collect(Collectors.toList()));
		
	}

}
