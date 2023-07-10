package javaStream.MAP;
import java.util.*;
import java.util.stream.Collectors;

//find length of each string from given collection
public class mapEx3 {
	public static void main(String[] args) {
		
		
		//create list and add elements:
		List<String> l= Arrays.asList("megha","hello","rutu","ram","raghu");
		l.stream().map(str-> str.length()).forEach(ans-> System.out.println(ans) );
		
		//or
		
		System.out.println("anothe way");
		List<Integer> len= new ArrayList<>();
		len= l.stream().map(x->x.length()).collect(Collectors.toList());
		for(int i=0;i<l.size();i++)
		{
			System.out.println("length of "+ l.get(i)+" is "+len.get(i));
			
		}
		
	
		

		
		
		
		
	
		
	}

}
