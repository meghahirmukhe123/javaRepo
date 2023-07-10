package conversion;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class setToList {

	public static void main(String[] args)
	{
		
		Set<Integer> s = Set.of(18,12,7,8,9);
		
		List<Integer> l=  s.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(l);
		
	}
}
