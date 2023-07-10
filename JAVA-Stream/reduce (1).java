package minMax;
import java.util.*;
public class reduce {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of list: ");
		int size= sc.nextInt();
		List<String> mylst= new ArrayList<>();
		System.out.println("enter string elements: ");
		for(int i=0;i<size;i++)
		{
			mylst.add(sc.next());
		}
		
		System.out.println("without use of reduce: ");
		
		System.out.println("my list is: "+ mylst);
		
		System.out.println("________________________________");
		
		//using reduce
		System.out.println("after using reduce() method: ");
		
		Optional<String> ans= mylst.stream().reduce((value,combineValue)->
		//                                   ->(identity, accumulator)<-
		{
			return value+combineValue;


		});
		
		System.out.println(ans.get());
		
		
		
		
		
		


	}

}
