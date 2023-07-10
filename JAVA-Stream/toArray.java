package minMax;
import java.util.*;

public class toArray {

	public static void main(String[] args) {
		
		//lets convert all the elements of stream into array: 
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of list collection: ");
		int size= sc.nextInt();
		List<Character> l= new ArrayList<>();
		System.out.println("enter charcter elements in list: ");
		for(int i=0;i<size;i++)
		{
			l.add(sc.next().charAt(0));
		}
		
		System.out.println("my character list is: "+l);
		
		//let add all elements in stream and then convert all elements in array
		Object myarr[]=l.stream().toArray();
		
		//get the array elements: 
		for(Object ch:myarr)
		{
			System.out.print(ch+" ");
			
		}
		
	}

}
