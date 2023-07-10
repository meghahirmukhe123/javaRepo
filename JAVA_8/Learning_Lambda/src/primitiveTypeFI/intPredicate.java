package primitiveTypeFI;

import java.util.function.IntPredicate;

//to reduce n number of conversion of autoboxing and autounboxing
public class intPredicate {
	public static void main(String[] args)
	
	{
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		
		IntPredicate p= i->i%2==0;   //no need to specify input type asit is IntPredicate
		for(int i:a)
		{
			System.out.println(p.test(i));
		}
		
	}

	
}
