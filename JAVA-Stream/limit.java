package distinctAndCountAndLimit;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;



public class limit {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length of collection: ");
		int size= sc.nextInt();
		List<String> l= new ArrayList<>();
		System.out.println("enter elements in list: ");
		for(int i=0;i<size;i++) 
		{
			l.add(sc.next());
			
		}
		
		System.out.println("mylist is: "+l+" and size of list is: "+l.size());
		
		//lets take only first 3 elements of collection
		
		l.stream().limit(3).forEach(x-> System.out.println("top 3 elements are: "+x));
		
		
		
		

	}

}
