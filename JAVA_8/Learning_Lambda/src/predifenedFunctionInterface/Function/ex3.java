package predifenedFunctionInterface.Function;
import java.util.*;
import java.util.function.Function;


//combine two funntions


public class ex3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<Integer> l1= List.of(2,4,5,6);
		
		//it will take make square of each element
		Function<Integer,Integer> f= i->i*i;
		
		//it will minus 1 from each element
		Function<Integer,Integer> f2=j->(j-1);
		
		//combine both function
		for(int l:l1)
		{
			System.out.println(f.andThen(f2).apply(l));  //it will make square of element then it will minus 1 from each square
			
			//or
			
			System.out.println(f.compose(f2).apply(l));
		}
		
	}

}
