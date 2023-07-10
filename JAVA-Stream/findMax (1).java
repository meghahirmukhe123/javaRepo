package minMax;
import java.util.*;

public class findMax {

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
		
		System.out.println("my integer list is: "+l);
		System.out.println("___________________________________");
		
		//1st way to find max from given list
		System.out.println("1st way of finding max number from list: ");
		int max= l.get(0);
		for(int i=1;i<l.size();i++) {
			if(l.get(i)>l.get(0))
			{
			max=l.get(i);
			}
		}
		System.out.println("max number from given list is: "+max);
		
		System.out.println("___________________________________");
		
		//finding max using stream
		System.out.println("finding max using stream: ");
		Optional<Integer>maxNum=l.stream().max((val1,val2)->{return val1.compareTo(val2);});
		
		//OR
		
		Integer m= l.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("another way of finding max humber: "+m);
		System.out.println("max from given list is: "+maxNum);
		
		
		
		
		
		
		

	}

}
