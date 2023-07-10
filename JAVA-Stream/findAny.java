package find;
import java.util.*;

public class findAny {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of set: ");
		int size= sc.nextInt();
		Set<String> s= new HashSet<>();
		System.out.println("enter string elements: ");
		for(int i=0;i<size;i++)
		{
			s.add(sc.next());
		}
		
		System.out.println("given set collection is: ");
		for(String str:s)
		{
			System.out.println(str);
		}
		
		System.out.println("____________________________________");
		
		Optional<String> ans= s.stream().findAny();
		System.out.println(ans);
		//or
		System.out.println("____________________________________");
		System.out.println(ans.get());

	}

}
