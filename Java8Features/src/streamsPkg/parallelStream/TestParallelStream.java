package streamsPkg.parallelStream;

import java.util.Arrays;
import java.util.List;

public class TestParallelStream {

	public static void main(String[] args) {
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		/*
		 * Sequential Stream:it follows order and runs items in sequence,
		 * 		it is slow in processing.
		 * 
		 *  Parallel stream: Runs in multiple threads, do not follow order,
		 *  		its faster in processing.
		 * */
		
		intList.stream().forEach(System.out :: println);
		
		System.out.println("*****************************");
		
		intList.stream().parallel().forEach(System.out :: println);
								//or
		System.out.println("*****************************");
		intList.parallelStream().forEach(System.out::println);
	}

}
