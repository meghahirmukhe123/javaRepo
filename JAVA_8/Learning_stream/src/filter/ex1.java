package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//find evern numbers from list then store it in map
public class ex1 {
	public static void main(String[] args)

	{
		List<Integer> l=new ArrayList<>();
		l.add(12);
		l.add(33);
		l.add(10);
		l.add(9);
		l.add(11);
		
		Map<Integer,Integer>map=l.stream().filter(x->x%2==0).collect(Collectors.toMap(a->a, b->b*b));  
//	                                                                 ->number_from_list<-->multiply even number with that number only<-
		System.out.println(map);
	}

}
