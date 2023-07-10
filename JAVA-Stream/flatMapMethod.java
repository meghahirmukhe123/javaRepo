package Examples;
import java.util.*;
import java.util.stream.Stream;

//ex:convert all first letter of each string of each collection to upperCase

public class flatMapMethod {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ex:convert all first letter of each string of each collection to upperCase");
		System.out.println("enter size of l1: ");
		int n1= sc.nextInt();
		List<String> l1= new ArrayList<>();
		System.out.println("enter elemets in l1: ");
		for(int i=0;i<n1;i++)
		{
			l1.add(sc.next());
		}
		System.out.println("list 1 is: ");
		for(String s1:l1)
		{
			System.out.println(s1);
		}
		System.out.println("");
		
		System.out.println("enter size of l2: ");
		int n2= sc.nextInt();
		List<String> l2= new ArrayList<>();
		System.out.println("enter elemets in l2: ");
		for(int i=0;i<n2;i++)
		{
			l2.add(sc.next());
		}
		System.out.println("list 2 is: ");
		for(String s2:l2)
		{
			System.out.println(s2);
		}
		System.out.println("");
		
		System.out.println("enter size of l3: ");
		int n3= sc.nextInt();
		List<String> l3= new ArrayList<>();
		System.out.println("enter elemets in l3: ");
		for(int i=0;i<n3;i++)
		{
			l3.add(sc.next());
		}
		System.out.println("list 3 is: ");
		for(String s3:l3)
		{
			System.out.println(s3);
		}
		
		
		List<List<String>> finalL= Arrays.asList(l1,l2,l3);
		System.out.println("______________________________________________________________________________");
		finalL.stream().flatMap(x->x.stream().map(n->n.charAt(0))).map(m->m.toUpperCase(m)).forEach(ans->System.out.println(ans));
		
		
		

	}

}
