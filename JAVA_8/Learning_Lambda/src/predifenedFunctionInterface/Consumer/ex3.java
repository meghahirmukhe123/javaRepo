package predifenedFunctionInterface.Consumer;

import java.util.function.Consumer;

//join 2 or more consumer


public class ex3 {
	public static void main(String[] args)
	{
		Consumer<String> c1= i->System.out.println("this is first: ");
		
		Consumer<String> c2= i2->System.out.println("this is second: ");
		
		Consumer<String> c3=i3->System.out.println("this is third:");
		
		//first way to combine
		
		c1.andThen(c2).andThen(c3).accept("hello");
		
		
		//second way of combining
		
		Consumer<String> s= c1.andThen(c2).andThen(c3);
		s.accept("xyz");
		
	}

}
