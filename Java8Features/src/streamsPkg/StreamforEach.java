package streamsPkg;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamforEach {

	public static void main(String[] args) {
		
		List<String> alphaNumerics = Arrays.asList("A11","AAA", "a22", "a82", "a66");
		System.out.println(alphaNumerics);
		
	
		alphaNumerics.stream().map(c-> c.toUpperCase()).filter(e -> e.startsWith("A")).forEach(elem -> System.out.println(elem));
		
		
		alphaNumerics.stream().map(c-> c.toUpperCase()).filter(e -> e.startsWith("A")).forEach(System.out :: println);
		
		
		
		
	}

}
