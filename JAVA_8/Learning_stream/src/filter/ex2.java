package filter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//print sting with its length

public class ex2 {
	public static void main(String[] args)
	{
		
		//ex1
		List<String> l= Arrays.asList("lizard","dog","cat","rat");
		
		Map<String,Integer> m= l.stream().filter(x->x.length()<5).collect(Collectors.toMap(a->a,b->b.length()));
		System.out.print(m);
		
		//ex2
		
		List<String> l1= Arrays.asList("megha","radha","ravi","kiran","abhi");
		
		Map<String,Boolean> map= l1.stream().filter(x->x.length()==5).collect(Collectors.toMap(z->z, y->y.length()==5));
		System.out.println(map);
		
		
		//ex3
		
		Set<Integer> s=Set.of(12,23,33,34,45,40,6,7,8,9,11);
		
		Map<Integer,Boolean> m1= s.stream().filter(x->x%2==0).collect(Collectors.toMap(x->x, y->(y%3==0)));
		System.out.println(m1);
		
	}

}
