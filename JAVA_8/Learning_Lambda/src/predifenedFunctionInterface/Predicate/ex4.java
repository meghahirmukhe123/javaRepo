package predifenedFunctionInterface.Predicate;

//check whether given collection is empty or not
import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ex4 {
	
	public static void main(String[] args)
	{
		
		Predicate<Collection> p= i->i.isEmpty();
		List<Integer> l= new ArrayList<>();
		System.out.println(p.test(l));  //ans is true.as we have not added anything in list
		
		
		l.add(12);
		System.out.println(p.test(l)); //ans is false.as we have added anything in list
		
		
	}
	  

}
