package Match;
import java.util.*;

public class anyMatch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of collection: ");
		int size= sc.nextInt();
		Set<String> s= new HashSet<>();
		System.out.println("enter string elements is set: ");
		for(int i=0;i<size;i++)
		{
			s.add(sc.next());
		}
		
		System.out.println("given set is: ");
		for(String str: s)
		{
			System.out.println(str);
		}
		
		//lets check any of string is ends with 'm' or not.if at least one string ends with 'm' o/p will be true else o/p will be false
		
		System.out.println("___________________________________");
		
		boolean myAns=s.stream().anyMatch(ans-> {return ans.endsWith("m");});
		System.out.println(myAns);
		

	}

}
