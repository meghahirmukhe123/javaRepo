package minMax;
import java.util.*;

public class findMin {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of list: ");
		int size= sc.nextInt();
		List<Integer> l= new ArrayList<>();
		System.out.println("enter elements in list: ");
		for(int i=0;i<size;i++)
		{
			l.add(sc.nextInt());
		}
		
		System.out.println("my integer list is: "+ l);
		
		//lets find min from given list
		Optional<Integer> minNum= l.stream().min((val1,val2)->{return val1.compareTo(val2);});
		System.out.println("min number from given list is: "+ minNum);

	}

}
