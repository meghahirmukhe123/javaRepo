package conversion;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class listToSet {

	public static void main(String[] args)
	{
		List<Integer> l= Arrays.asList(12,45,5,2,34,56,23,12,34,56,78,89,90);
		System.out.println("list is: "+l);
		
		Set<Integer> s = l.stream().filter(x->x%3==0).collect(Collectors.toSet());
		System.out.println("set is: "+s);
	}
}
