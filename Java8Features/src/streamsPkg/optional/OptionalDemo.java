package streamsPkg.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		List<String> flats = Arrays.asList("B01", "B13", "B04", "D11", "B10", "C23", "D7");

		Optional<String> result = 
				flats.stream().filter(flat -> flat.startsWith("Z")).findFirst();
		
		
		// Way 1
		/*
		 * if(result.isPresent()) {
		 * 
		 * System.out.println(result.get()); }else {
		 * 
		 * System.out.println("No result found!"); }
		 */
		
		//Way 2
		result.ifPresent(data ->System.out.println(data));
		System.out.println(result.orElse("Not Found!!!"));
		
		//Way 3
		result.ifPresent(System.out::print);
		
		System.out.println(result.orElse("Not Found!!!"));
		            //or
		String msg = result.orElseGet(()->"Opss!! No Data.");
		System.out.println(msg);
	}

}
