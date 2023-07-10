package distinctAndCountAndLimit;
import java.util.*;
import java.util.List;


public class count {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of list: ");
		int size= sc.nextInt();
		List<Integer> l= new ArrayList<>();
		System.out.println("enter elements is list: ");
		for(int i=0;i<size;i++)
		{
			l.add(sc.nextInt());	
		}
		
		long ans= l.stream().distinct().count();
		System.out.println("count of distinct element is: "+ans);
		
		System.out.println("____________________________________");
		
		//lets find count of all the elements of given collection
		
		long ans1= l.stream().count();
		System.out.println("count of list is: "+ ans1);
	}

}
