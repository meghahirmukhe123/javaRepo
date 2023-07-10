package Match;
import java.util.*;

public class allMatch {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of set: ");
		int size= sc.nextInt();
		Set<Integer> s= new HashSet<>();
		System.out.println("enter integer elements in set: ");
		for(int i=0;i<size;i++)
		{
			s.add(sc.nextInt());
		}
		
		System.out.println("given set is: ");
		for(Integer i: s)
		{
			System.out.println(i+" ");
		}
		
		System.out.println("______________________________________________");
		
		//lets check all the elements is even or not
		
		boolean myans=s.stream().allMatch(x-> {return x%2==0 ;});
		System.out.println(myans);
	}

}
