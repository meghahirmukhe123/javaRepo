package find;
import java.util.*;

public class findFirst {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of vector collection: ");
		int size= sc.nextInt();
		Vector<Integer> v= new Vector<>();
		System.out.println("enter integer elements in vector: ");
		for(int i=0;i<size;i++)
		{
			v.add(sc.nextInt());
		}
		System.out.println("given vector collection is: ");
		for(Integer i:v)
		{
			System.out.println(i);
		}
		
		Optional<Integer> ans=v.stream().findFirst();
		
		System.out.println("first element from given stream is: "+ ans);
		
		//or
		System.out.println("____________________________________");
		
		System.out.println("first element from given stream is: "+ ans.get());

	}

}
