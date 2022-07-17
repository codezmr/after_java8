package streamsPkg;

import java.util.ArrayList;
import java.util.List;

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
		
		
		List<Integer> oddNumber = new ArrayList<Integer>();
		for(Integer num : numbers) {
			
			//find odd number
			if(num % 2 !=0) oddNumber.add(num); 
		}
		
		System.out.println(oddNumber);
	}

}
