package conversion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class listTomap {
	
	public static void main(String[] args)
	{
		List<Integer> l= Arrays.asList(12,34,3,5,6,7,78,89,8,90);
		Map<Integer,Integer> m= l.stream().filter(x->x%2==0).collect(Collectors.toMap(a->a, b->b*2));
		
		System.out.println(m);
		
	}

}
