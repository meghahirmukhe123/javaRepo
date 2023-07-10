package predifenedFunctionInterface.supplier;

import java.util.function.Supplier;

//to get random string value from string array

public class ex1 {
	public static void main(String[] args)
	{
		Supplier<String> s= ()->
		{
			String[] arr= {"hello","world","ram","ICDI"};
			int i= (int)(Math.random()*4);
			return arr[i];
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
