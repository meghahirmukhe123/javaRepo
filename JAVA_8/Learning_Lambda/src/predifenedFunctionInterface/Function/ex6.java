package predifenedFunctionInterface.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//find total salory of all employees

class emp1{
	String name;
	String dept;
	int salory;
	
	public emp1(String name,String dept,int salory)
	{
		this.name=name;
		this.dept=dept;
		this.salory=salory;
	}
	
	public String toString()
	{
		String s= String.format("(%s,%s,%d)",name,dept,salory);
		return s;
	}
}

public class ex6 {

	public static void main(String[] args) {
		List<emp1> em= new ArrayList<>();
		populate(em);
		System.out.println(em);
		
		
		Function<List<emp1>, Integer> f= l1-> {
			int total=0;
			for(emp1 x:l1)
			{
				total=total+x.salory;
			}
			return total;
			
		};
		System.out.println("total salory to be paid per month is: "+f.apply(em));
		
		
		
		
		
		
}
	
	public static void populate(List<emp1> em)
	{
		em.add(new emp1("megha","HR",30000));
		em.add(new emp1("tanu","HR",20000));
		em.add(new emp1("raju","HR",10000));
		em.add(new emp1("hari","HR",10000));
	}

}
