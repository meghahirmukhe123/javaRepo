package primitiveTypeFI;

import java.util.function.UnaryOperator;

//when we have same input and return type use this.it is child inteface of function only.
public class unaryOperator {
	public static void main(String[] args)
	{
		
		//ex1:
		UnaryOperator<Integer> u= i->i*i;
		System.out.println(u.apply(4));
		
		//ex2:lowercase to uppercase
		
		UnaryOperator<String> str= s->s.toUpperCase();
		String[] st= {"car","cat","dog","mouse","elephant"};
		for(String a:st)
		{
			System.out.println(str.apply(a));
		}
	}

}
