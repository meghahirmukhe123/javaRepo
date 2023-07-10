 package predifenedFunctionInterface.TwoArgumentFI.BiConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

//increment salory using consumer.in this example we have used bifunction as well.
class emp
{
	String name;
	int salory;
	String dept;
	
	public emp(String name,int salory,String dept)
	{
		this.name=name;
		this.salory=salory;
		this.dept=dept;
	}
}
public class ex2 {
	public static void main(String[] args)
	{
		List<emp> l= new ArrayList<>();
		l.add(new emp("megha",20000,"IT"));
		l.add(new emp("tanu",30000,"IT"));
		l.add(new emp("manu",40000,"IT"));
		l.add(new emp("raju",50000,"IT"));
		
		BiFunction<String,Integer,emp> b=(name,salory)->new emp(name,salory, name);
		
		BiConsumer<emp, Integer> z=(e,i)->e.salory=e.salory+i;
		
		for(emp e:l)
		{
			z.accept(e, 2000);
			
		}
		
		for(emp e:l)
		{
			System.out.println(e.name);
			System.out.println(e.dept);
			System.out.println(e.salory);
		}
	}

}
