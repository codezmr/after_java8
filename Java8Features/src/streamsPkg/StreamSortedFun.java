package streamsPkg;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamSortedFun {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(11);
		numbers.add(65);
		numbers.add(12);
		numbers.add(33);
		numbers.add(91);
		numbers.add(48);
		numbers.add(21);
		numbers.add(74);

		// normal insertion order
		System.out.println(numbers);

		// ascending sort

		System.out.println("Ascending Sorted : " + numbers.stream().sorted().collect(Collectors.toList()));
		
		
		//Descending shorting custom order
		System.out.println("Descending Sorted : " + numbers.stream().sorted((elem1, elem2) -> elem2.compareTo(elem1)).collect(Collectors.toList()));
		
		//Descending shorting
		System.out.println("Descending Sorted : " + numbers.stream().sorted((elem1, elem2) -> -elem1.compareTo(elem2)).collect(Collectors.toList()));
		
	
	}

}
