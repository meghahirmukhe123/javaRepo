package javaStream.filterExamples;
import java.util.*;
import java.util.stream.Collectors;

//que:store odd number from list to another list

public class filterEx5 {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("enter size of collection: ");
		int size= sc.nextInt();
		List<Integer> l= new ArrayList<>();
		System.out.println("enter integer elements in list: ");
		for(int i=0;i<size;i++)
		{
			l.add(sc.nextInt());
		}
		
		System.out.println("given list is: ");
		for(Integer list:l)
		{
			System.out.println(list);
		}
		
		//lets find odd number and count of that odd numbers
		
		l.stream().parallel().filter(x->x%2 !=0).forEach(ans->System.out.println("odd numbers are: "+ans));
		//                         ->predicate<-
		//OR
		List<Integer> ans= l.parallelStream().filter(x->x%2!=0).collect(Collectors.toList());
		Integer count= (int) ans.stream().count();
		System.out.println("odd number are: "+ans+" total count of odd numbers are: "+count);

	}

}
