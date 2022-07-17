package streamsPkg.extra;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExtra {

	public static void main(String[] args) {
		
		int num[] = {3,5,9,8,7,17,92};
		//long
		//double
		
		//this method of converting to stream only works for primetive data type
		  //like : int, long, double.
		IntStream is =  Arrays.stream(num);
		
		//convert any to stream
		Stream s1 =  Stream.of(num);
		
		Stream s2 = Stream.of(2,4,3,9,6,7,18);
		Stream s3 = Stream.of(12,4,31,29,6,7,18);
		
		Stream s4 = Stream.concat(s2, s3).distinct();
		
		
		s4.forEach(System.out::println);
		

	}

}
