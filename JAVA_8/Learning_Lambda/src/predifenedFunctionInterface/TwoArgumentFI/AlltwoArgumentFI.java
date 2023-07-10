package predifenedFunctionInterface.TwoArgumentFI;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

//basic examples of all two argument functional interface
public class AlltwoArgumentFI {
	public static void main(String[] args)
	{
		//BiPredicate(takes 2 inputs)
		
		BiPredicate<Integer,Integer> bi=(a,b)->(a+b) %2 ==0;
		System.out.println("predicate answer");
		System.out.println(bi.test(2, 2));  //true
		System.out.println(bi.test(2, 1));  //false
		System.out.println("_______________________________________________________________________________________--");
		
		
		//BiFunction
		BiFunction<Integer, Integer, Integer> b= (a,c)->(a*c);
		System.out.println("bifunction answer");
		System.out.println(b.apply(3, 9));
		System.out.println("_______________________________________________________________________________________--");
		
		//BiConsumer
		System.out.println("biconsumer answer");
		BiConsumer<String,Integer> v= (s,t)->System.out.println(s+" "+t);
		
		v.accept("hello", 23);
		
		
		
	}

}
