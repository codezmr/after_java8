package streamsPkg.minmax;

import java.util.Arrays;
import java.util.List;

public class FindMinMax {

	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(22,4,33,53,82,19,73);
		
		Integer minVal = numbers.stream().min((a, b)-> a.compareTo(b)).get();
		Integer maxVal = numbers.stream().max((a, b)-> a.compareTo(b)).get();

		System.out.println("Minimum Number is: "+ minVal + "\nMaximum number is: "+ maxVal);
	
	}

}
