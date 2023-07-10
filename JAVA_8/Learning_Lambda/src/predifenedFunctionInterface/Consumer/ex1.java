package predifenedFunctionInterface.Consumer;

import java.util.function.Consumer;

//take simple string imput.print length of string
public class ex1 {
	
	public static void main(String[] args)
	{
		Consumer<String> s= i->System.out.println(i.length());
		
		s.accept("hello consumer");
	}

}
