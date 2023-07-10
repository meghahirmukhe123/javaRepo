package Examples;
import java.util.*;

//que:lets check all the character  present in uppercase or not

public class allMatch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of character:  ");
		int num= sc.nextInt();
		List<Character> l= new ArrayList<>();
		System.out.println("enter character:  ");
		for(int i=0;i<num;i++)
		{
			l.add(sc.next().charAt(0));
		}
		System.out.println("characters are: ");
		for(Character ch:l)
		{
			System.out.println(ch);
		}
		
		boolean ans=l.stream().allMatch(x-> {return x.equals(x.toUpperCase(x));});
		System.out.println(ans);
		
		
	}

}
