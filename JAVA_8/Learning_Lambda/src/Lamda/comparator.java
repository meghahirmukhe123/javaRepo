package Lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class comparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if(o1>o2)
		{
			return -1;
		}
		else if(o1<o2)
		{
			return +1;
		}
		else {
			return 0;
		}
	
	}
		
}

class mytest{
	public static void main(String[] args)
	{
	
		List<Integer> l= new ArrayList<Integer>();
		l.add(12);
		l.add(1);
		l.add(10);
		l.add(9);
		
		Collections.sort(l,new comparator());
		System.out.println(l);
		
	}
}
