package predifenedFunctionInterface.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//print those emp name whose salory is >30000 and exp>3

class emp{
	String name;
	int salory;
	int exp;
	
	emp(String name,int salory,int exp)
	{
		this.name=name;
		this.salory=salory;
		this.exp=exp;
	}
}
public class ex1 {
	
	public static void main(String[] args)
	{
		List<emp> l=new ArrayList<>();
		l.add(new emp("megha",20000,3));
		l.add(new emp("anu",30000,4));
		l.add(new emp("tanu",29000,9));
		
		Predicate<emp> e=i->(i.salory>25000 && i.exp>3);
		for(emp ex:l)
		{
			if(e.test(ex))
			{
				System.out.println(ex.name);
			}
		}
			
				
		
		
	
	}

}
