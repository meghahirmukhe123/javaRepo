package primitiveTypeFI.function;

import java.util.function.LongFunction;

public class longFunction {

	public static void main(String[] args)
	{
		long[] arr= {1,2,3,4,5,6};
		LongFunction<Integer> l = i -> (int) (i % 2);
		
		for(long j:arr)
		{
			System.out.println(l.apply(j));
		}
	}
}
