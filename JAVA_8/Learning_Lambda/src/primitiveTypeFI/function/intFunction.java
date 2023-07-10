package primitiveTypeFI.function;

import java.util.function.IntFunction;

public class intFunction {

	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6};
		
		IntFunction<Integer> p= i->i*2;  //here <Integer> is return type.no need provide input type.as it is IntFunction
		for(int j:arr)
		{
			System.out.println(p.apply(j));
		}
		
	}
}
