package javaStream.filterExamples;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//filter null values from collection
public class filterEx3 {

	public static void main(String[] args) {
		
		List<String> l= Arrays.asList("megha","anu",null,"abhi",null,"raju");
		
		List<String> ans= new ArrayList<>();
		
		ans=l.stream().filter(str->str != (null)).collect(Collectors.toList());
		System.out.println(ans);
		
		System.out.println("____________________________");
		
		l.stream().filter(str->str != null).forEach(str->System.out.println(str));
		
		
		
		
	}

}
