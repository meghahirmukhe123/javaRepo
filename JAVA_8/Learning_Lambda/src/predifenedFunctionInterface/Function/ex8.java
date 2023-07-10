package predifenedFunctionInterface.Function;

import java.util.function.Function;

//function chaining


public class ex8 {
	
	public static void main(String[] args)
	{
		String str="hello lamada function";
		Function<String,String> f1= i->i.toUpperCase();
		Function<String,String> f2= i->i.substring(0, 7);
		
		//combine both functions
		
		System.out.println(f1.andThen(f2).apply(str));
		
		//second way to combine
		//when we have used compose f2 will execute first then f1 will execute
		System.out.println(f1.compose(f2).apply(str));
		
		
		
	}

}
