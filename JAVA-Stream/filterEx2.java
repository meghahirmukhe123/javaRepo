package javaStream.filterExamples;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//having two condition 
public class filterEx2 {
	public static void main(String[] args) {
		
	
		//add data in collection
		List<String> s= Arrays.asList("megha","anu","raju","hirmukhe","john");
		
		List<String> ans= new ArrayList<>();  //to store answer
		
		ans=s.stream().filter(str-> str.length()>3 && str.length()<5).collect(Collectors.toList());
		
		System.out.println(ans);
		
		System.out.println("__________________________________________");
		
		
	  s.stream().filter(str-> str.length()>3 && str.length()<5).forEach(str->System.out.println(str));
	
	  System.out.println("__________________________________________");
	  
	  s.stream().filter(str->str.length()>3 && str.length()<5).forEach(System.out::println);
	  
	  
	
	
	}

}
