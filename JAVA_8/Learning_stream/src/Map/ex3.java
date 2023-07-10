package Map;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ex3 {
	public static void main(String[] args)
	
	{
		Set<Integer> set= Set.of(12,34,3,4,5,6,7,8,9);
		
		Map<Integer,Boolean> map= set.stream().map(x->x*2).collect(Collectors.toMap(x->x, z->(z%2==0)&&(z%3==0)));
		System.out.println(map);
	}

}
