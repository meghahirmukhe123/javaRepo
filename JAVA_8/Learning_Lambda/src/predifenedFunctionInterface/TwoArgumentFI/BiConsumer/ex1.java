package predifenedFunctionInterface.TwoArgumentFI.BiConsumer;

import java.util.function.BiConsumer;

//accept two string and print concat of both
public class ex1 {
	public static void main(String[] args)
	{
		BiConsumer<String,String> b= (i,j)->{
			System.out.println(i.concat(j));
		};
		
		b.accept("hello", "world");
	}
	

}
