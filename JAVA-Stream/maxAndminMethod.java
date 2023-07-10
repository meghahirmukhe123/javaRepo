package Examples;
import java.util.*;

public class maxAndminMethod {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of intege collection: ");
		int size= sc.nextInt();
		List<Integer> l= new ArrayList<>();
		System.out.println("enter integer elements: ");
		for(int i=0;i<size;i++)
		{
			l.add(sc.nextInt());
		}
		System.out.println("given list is: "+l  );
		for(Integer i:l)
		{
			System.out.println(i);
		}
		Optional<Integer> max=l.stream().max((val1,val2)->{return val1.compareTo(val2);});
		System.out.println("max number is: "+max);
		
		Optional<Integer> min=l.stream().min((val1,val2)->{return val1.compareTo(val2);});
		System.out.println("min number is: "+min);
		
	}

}
