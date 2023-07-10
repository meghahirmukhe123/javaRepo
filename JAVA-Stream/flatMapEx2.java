package flatMap;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class flatMapEx2 {
	public static void main(String[] args) {
		List<String> s1= Arrays.asList("A","B","C");
		List<String> s2= Arrays.asList("D","E","F");
		List<String> s3= Arrays.asList("G","H","I");
		List<String> s4= Arrays.asList("J","K","L");
		
		List<List<String>> ans= Arrays.asList(s1,s2,s3,s4);
		
		List<String> finalAns=ans.stream().flatMap(x-> x.stream()).collect(Collectors.toList());
		System.out.println(finalAns);
		
	}

}
