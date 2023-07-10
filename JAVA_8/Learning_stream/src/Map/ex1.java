package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//add 10 in each element
public class ex1 {

	public static void main(String[] args)
	{
		List<Integer> l= Arrays.asList(1,2,3,4,5);
		l.stream().map(x->(x+10)).forEach(s->System.out.println(s));
	}
}
