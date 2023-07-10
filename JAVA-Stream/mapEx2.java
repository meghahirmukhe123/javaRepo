package javaStream.MAP;
import java.util.List;
import java.util.ArrayList;
import java.util.*;


//add 5 to each element of collection

public class mapEx2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter count of elements to be added in list: ");
		int c= sc.nextInt();
		System.out.println("enter elements: ");
		List<Integer> l= new ArrayList<>();
		for(int i=0;i<c;i++) {
			l.add(sc.nextInt());
		}
		
		System.out.println("given list is: "+l);
		System.out.println("______________________________");
		List<Integer> l2= new ArrayList<>(l);
		System.out.println(l2);
		System.out.println("______________________________");
		
		
		//add above list in stream
		l2.stream().map(n-> n+5).forEach(m->System.out.println(m));
		
		
		
		
		
		

	}

}
