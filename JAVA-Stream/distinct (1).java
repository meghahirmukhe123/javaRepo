package distinctAndCountAndLimit;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

//find distinct elements from given collection

public class distinct {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter siz of list collection: ");
		int size= sc.nextInt();
		List<Integer> l= new ArrayList<>();
		for(int i=0;i<size;i++) {
			l.add(sc.nextInt());
		}
		
		System.out.println("my list is: "+ l);
		
		//convert this collection to stream
		l.stream().distinct().forEach(ans-> System.out.println("distinct elements from given list is: "+ ans));
		

	}

}
