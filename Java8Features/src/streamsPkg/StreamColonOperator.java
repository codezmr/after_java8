package streamsPkg;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamColonOperator {

	public static void main(String[] args) {
		
		List<String> alphaNumerics = Arrays.asList("A11","AAA", "a22", "a82", "G66");
		System.out.println(alphaNumerics);
		
		List<String> strList =  alphaNumerics.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(strList);
		
		
		List<String> uperCaseList =  alphaNumerics.stream().map(c-> c.toUpperCase()).filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(uperCaseList);
		
		//use of :: 
		List<String> uperCaseList2 =  alphaNumerics.stream().map(String :: toUpperCase).filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(uperCaseList2);
		
		
	}

}
