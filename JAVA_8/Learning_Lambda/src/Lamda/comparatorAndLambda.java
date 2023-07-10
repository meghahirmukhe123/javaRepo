package Lamda;
import java.util.*;


//print number in descending order
public class comparatorAndLambda {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		List<Integer> l= new ArrayList<>();
		for(int i=0;i<size;i++)
		{
		   l.add(sc.nextInt());
		   
		}
		
		Collections.sort(l,(i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
		System.out.println(l);
			
		
		
	}

}
