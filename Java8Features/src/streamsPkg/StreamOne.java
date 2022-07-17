package streamsPkg;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOne {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		
		System.out.println(numbers);
		//Until JAVA-7 way
		
		List<Integer> oddNumber = new ArrayList<Integer>();
		for(Integer num : numbers) {
			
			//find odd number
			if(num % 2 !=0) oddNumber.add(num); 
		}
		
		System.out.println(oddNumber);
		
		/* JAVA-8 Stream */
		
		//Stream<Integer> strm =  numbers.stream();
		
		Predicate<Integer> predicate = num -> num%2 !=0;
		
		oddNumber = numbers.stream().filter(predicate).collect(Collectors.toList());
			
		System.out.println("Odd Nunber Using JAVA-8 Stream filter method: "+oddNumber);
		
		
		
	}

}










































