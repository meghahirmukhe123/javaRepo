package find;
import java.util.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class concat {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of set 1: ");
		int one= sc.nextInt();
		Set<Character> s1= new HashSet<>();
		System.out.println("enter char elements: ");
		for(int i=0;i<one;i++)
		{
			s1.add(sc.next().charAt(0));
		}
		
		System.out.println("set 1 is: ");
		for(Character ch:s1)
		{
			System.out.println(ch);
		}
		
		System.out.println("____________________________________");
		System.out.println("enter size of set 2: ");
		int two= sc.nextInt();
		Set<Character> s2= new HashSet<>();
		System.out.println("enter char elements: ");
		for(int i=0;i<two;i++)
		{
			s2.add(sc.next().charAt(0));
		}
		
		System.out.println("set 2 is: ");
		for(Character ch:s2)
		{
			System.out.println(ch);
		}
		
		System.out.println("____________________________________");
		//let merge above two sets using stream
		
		Stream<Character> a1=s1.stream();
		Stream<Character> a2=s2.stream();
		
		System.out.println("____________________________________");
		System.out.println("after concatination: ");
		Set<Character> c= (Set<Character>) Stream.concat(a1, a2).collect(Collectors.toList());
		for(Character ans: c)
		{
			System.out.println(ans);
		}
				
				
				
				
		

	}

}
