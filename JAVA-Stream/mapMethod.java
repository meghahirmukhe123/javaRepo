package Examples;
import java.util.*;
import java.util.stream.Collectors;

//1:replace character 'a' of each string with '*'

//2:replace first letter of each element of collection to uppercase
public class mapMethod {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ex1: replace character 'a' of each string with '*'");
		System.out.println("ex:replace character 'a' of each string with '*'");
		System.out.println("enter number of characters: ");
		int n= sc.nextInt();
		List<String> l= new ArrayList<>();
		System.out.println("enter String in list: ");
		for(int i=0;i<n;i++)
		{
			l.add(sc.next());
		}
		System.out.println("given char list is: ");
		for(String ch:l)
		{
			System.out.println(ch);
			
		}
		System.out.println("after replacement of 'a' with '*' ");
		l.stream().map(x->x.replace('a', '*')).forEach(ans->System.out.println(ans));
		
		System.out.println("___________________________________________________________________________");
		System.out.println("ex2:replace first letter of each element of collection to uppercase ");
		System.out.println("enter size of collection: ");
		int size= sc.nextInt();
		List<String> str= new ArrayList<>();
		System.out.println("enter string elements in collection: ");
		for(int i=0;i<size;i++)
		{
			str.add(sc.next());
		}
		System.out.println("given list is: "+str);
		
		str.stream().map(s->s.substring(0, 1).toUpperCase()+s.substring(1, s.length())).forEach(ans->System.out.println(ans));
		
		
		
		


		
		
		

	}

}
