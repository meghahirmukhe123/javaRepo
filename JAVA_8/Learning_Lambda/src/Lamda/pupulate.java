package Lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class emp{
	String name;
	String dept;
	String city;
	
	public emp(String name,String dept,String city)
	{
		this.name=name;
		this.dept=dept;
		this.city=city;
	}
	
	//override toString()
	
	public String toString()
	{
		String s = String.format("(%s,%s,%s)",name,dept,city);
		return s;
	}
}

class pupulate {
	public static void main(String[] args)
	{
		List<emp> e= new ArrayList<>();
		populate(e);
		System.out.println(e);
		
		Predicate<emp> p=i->i.dept.equals("hr");
		for(emp em:e)
		{
			if(p.test(em))
			{
				System.out.println(em.name+" "+em.dept+" "+em.city);
			}
		}
		
		
	}
	
	public static void populate(List<emp> e) {
		e.add(new emp("megha","it","pune"));
		e.add(new emp("tanu","it","mumbai"));
		e.add(new emp("raju","hr","pune"));
		e.add(new emp("kiran","it","gujrat"));
		
	}




}
