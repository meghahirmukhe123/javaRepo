package sorted;
import java.util.*;
import java.util.stream.Collectors;
//sorted sorts objects in stream

public class sortedMethod {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of list: ");
		int size= sc.nextInt();
		List<Integer> l= new ArrayList<>();
		System.out.println("enter Integer elements: ");
		for(int i=0;i<size;i++)
		{
			l.add(sc.nextInt());
		}
		
		System.out.println("given list before sorting is: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(l.get(i));
		}
		
		//use sorted() method
		
		List<Integer> ans= l.stream().sorted().collect(Collectors.toList());
		
		System.out.println("after sorting list is: "+ ans);
		
		//lets only print the sorted list without storing to any other list
		
		System.out.println("lets print using forEach way 1: ");
		l.stream().sorted().forEach(x-> System.out.println(x));
		
		System.out.println("lets print using forEach way 2: ");
		
		l.stream().sorted().forEach(System.out::println);
		
		System.out.println("____________________________________________");
		
		System.out.println("lets print above list in reverse order");
		l.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
		
	
		
		
		
		

	}

}
