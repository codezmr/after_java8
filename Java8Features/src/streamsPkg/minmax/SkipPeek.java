package streamsPkg.minmax;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipPeek {

	public static void main(String[] args) {
		
		List<String> flats = Arrays.asList("B01", "B13", "B04", "D11", "B10", "C23", "D7");
		
		List<String> shortFlats = flats.stream().filter(f -> f.startsWith("B")).sorted().collect(Collectors.toList());
		
		System.out.println(shortFlats);
		
		List<String> skipFlats = flats.stream().peek(System.out :: println)
				.filter(f -> f.startsWith("B")).sorted().skip(2).collect(Collectors.toList());
		
		System.out.println(skipFlats);
		
		
		

	}

}
