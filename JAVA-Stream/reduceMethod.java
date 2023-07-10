package Examples;
import java.util.*;

public class reduceMethod {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of collection: ");
		int size= sc.nextInt();
		List<Integer> l= new ArrayList<>();
		System.out.println("enter integer elements in list:  ");
		for(int i=0;i<size;i++)
		{
			l.add(sc.nextInt());
		}
		System.out.println("given list is:  ");
		for(Integer i:l)
		{
			System.out.println(i);
		}
		
		Optional<Integer>ans=l.stream().reduce((value,combineValue)->{return value+combineValue;});
		System.out.println(ans.get());   //it will sum of all the integer elements from list
		
		
		
		
		
		
		
		
		
		
		

	}

}
