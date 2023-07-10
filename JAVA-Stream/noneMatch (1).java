package Match;
import java.util.*;


public class noneMatch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of set: ");
		int size = sc.nextInt();
		Set<Character> ch= new HashSet<>();
		System.out.println("enter character elements: ");
		for(int i=0;i<size;i++)
		{
			ch.add(sc.next().charAt(0));
		}
		
		System.out.println("given char collection is: ");
		for(Character ch2: ch)
		{
			System.out.println(ch2+" ");
		}
		
		System.out.println("__________________________________________________");
		
		//lets compare all the elements with 'a'. if none of elements matches with 'a' it will print true else it will print false
		boolean myans=ch.stream().noneMatch(x-> {return x.equals('a');});
		System.out.println(myans);
		if(myans==true) {
			System.out.println("ans is true because 'a' is not present in given stream.");
		} else if(myans==false) {
			System.out.println("ans is false because 'a' present in given stream.");
		}

	}

}
