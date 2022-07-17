package streamsPkg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {
		
		//Multiply by 3 to each number
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		
		System.out.println(numbers); //[1, 2, 3, 4, 5, 6, 7]
		// output should be            [3, 6, 9, 12, 15, 18, 21]
		
		//mapping
		
		List<Integer> result = new ArrayList<Integer>();
		
		result = numbers.stream().map(a -> a*3).collect(Collectors.toList());
		
		System.out.println(result);
	}

}










































