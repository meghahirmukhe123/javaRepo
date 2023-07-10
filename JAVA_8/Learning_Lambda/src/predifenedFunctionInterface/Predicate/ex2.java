package predifenedFunctionInterface.Predicate;

import java.util.function.Predicate;

//combine two predicates

public class ex2 {

	
	public static void main(String[] args)
	{
		int[] arr= {2,6,78,90,4,5,99,24,22,45,67,76,38};
		Predicate<Integer> p=i->(i%2==0);   //this is to check even number
		
		Predicate<Integer> p2=i2->i2>50;
		
		for(int a:arr)
		{
//			if(p.test(a) && p2.test(a))
//			{
//				System.out.println("those numbers ara: "+a);
//			}
			
			
			//or
			if(p.and(p2).test(a))
			{
				System.out.println(a);
			}
		}
		
	
	}
}
