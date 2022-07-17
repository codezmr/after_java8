package streamsPkg.setmap;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.*;

public class StreamToMap {

	public static void main(String[] args) {

		Set<Integer> numSet = new HashSet<>();
		numSet.add(1);
		numSet.add(2);
		numSet.add(3);
		numSet.add(4);
		numSet.add(5);
		numSet.add(6);
		numSet.add(7);

		Set<Integer> filteredSet = numSet.stream().filter(a -> a > 3).collect(toSet());

		System.out.println(filteredSet);

		Map<Integer, Integer> newMap = numSet.stream().collect(toMap(x -> x, y -> y * 100));
		System.out.println(newMap);
	}

}
