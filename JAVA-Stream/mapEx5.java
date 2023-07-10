package javaStream.MAP;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

//multiply by any number to each element of given collection
public class mapEx5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of collection: ");
		int size= sc.nextInt();
		System.out.println("enter the number thr which each element should multiply" );
		int number= sc.nextInt();
		System.out.println("enter elements: ");
		List<Integer> l= new ArrayList<>();
		for(int i=0;i<size;i++)
		{
			l.add(sc.nextInt());
			
		}
		
		System.out.println("list is: "+l);
		
		l.stream().map(n->n*number).forEach(ans->System.out.println(ans));
		
		//lets store ans in another collection
		List<Integer> answer = new ArrayList<>();
		answer= l.stream().map(n-> n*number).collect(Collectors.toList());
		System.out.println(answer);
	
		
		
		
		
		
		
	
		
		
	}

}
