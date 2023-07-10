package javaStream.MAP;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//convert all element of collection in upper case and store in another collection
public class example1 {
	public static void main(String[] args) {
		
		List<String> l= Arrays.asList("megha","anu","raju","ravi","priya");
		
		List<String> ans= new ArrayList<>();
		
		ans=l.stream().map(n-> n.toUpperCase()).collect(Collectors.toList());
		System.out.println(ans);
		
		System.out.println("____________________________________");
		
		l.stream().map(m-> m.toUpperCase()).forEach(n->System.out.println(n));
		
		System.out.println("____________________________________");
		
		l.stream().map(n-> n.toUpperCase()).forEach(System.out::println);
		
	}

}
