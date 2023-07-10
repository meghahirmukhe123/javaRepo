package conversion;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class setTomap {

	public static void main(String[] args)
	{
		Set<String> s= Set.of("cat","dog","rat","rabbit","lizard");
		
		Map<String,Boolean> map= s.stream().map(x->x.substring(0, 1).toUpperCase()+x.substring(1, x.length())).collect(Collectors.toMap(a->a, b->b.endsWith("t")));
		System.out.println(map);
	}
}
