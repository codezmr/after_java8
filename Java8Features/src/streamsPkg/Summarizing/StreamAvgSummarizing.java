package streamsPkg.Summarizing;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAvgSummarizing {

	public static void main(String[] args) {

		Set<Integer> numSet1 = new HashSet<>();
		numSet1.add(13);
		numSet1.add(23);
		numSet1.add(43);
		numSet1.add(42);
		numSet1.add(95);
		numSet1.add(16);
		numSet1.add(74);

		IntSummaryStatistics summary1 = numSet1.stream().collect(Collectors.summarizingInt(x -> x));
		System.out.println(summary1);

		Set<Integer> numSet2 = new HashSet<>();
		numSet2.add(51);
		numSet2.add(11);
		numSet2.add(213);
		numSet2.add(14);
		numSet2.add(90);
		numSet2.add(10);
		numSet2.add(71);

		IntSummaryStatistics summary2 = numSet2.stream().collect(Collectors.summarizingInt(x -> x));
		summary1.combine(summary2);//IntSummaryStatistics{count=14, sum=766, min=10, average=54.714286, max=213}
		
		System.out.println(summary1);
		
		
	}

}
