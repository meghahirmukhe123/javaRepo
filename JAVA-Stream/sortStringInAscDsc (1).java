package sorted;
import java.util.*;

//lets print ascending and descending order of string


public class sortStringInAscDsc {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of string list: ");
		int size= sc.nextInt();
		List<String> l= new ArrayList<>();
		System.out.println("enter string elements: ");
		for(int i=0;i<size;i++)
		{
			l.add(sc.next());
		}
		
		System.out.println("given string list is: ");
		for(String str:l)
		{
			System.out.println(str);
		}
		
		//let print above string list in ascending order
		System.out.println("given string list in ascending order: ");
		l.stream().sorted().forEach(x-> System.out.println(x));
		
		//lets print above string list in descending order
		System.out.println("given string in descending order: ");
		l.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
	}

}
