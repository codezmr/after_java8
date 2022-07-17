package streamsPkg.minmax;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDistictElements {

	public static void main(String[] args) {
		
		
		List<Integer> duplicateNums = Arrays.asList(19,73,33,22,4,33,53,82,53,82,19);
		
		List<Integer> dupSortList = duplicateNums.stream().sorted().collect(Collectors.toList());
	
		System.out.println(dupSortList);
		
		List<Integer> distDupElemt = dupSortList.stream().distinct().collect(Collectors.toList());
		System.out.println(distDupElemt);
	}
	
	
}
