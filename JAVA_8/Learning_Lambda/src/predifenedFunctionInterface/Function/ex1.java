package predifenedFunctionInterface.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//if salory is >30000 then add 20% bonus in that salory

class emp{
	String name;
	int salory;
	
	emp(String name,int salory)
	{
		this.name= name;
		this.salory=salory;
	}
}

public class ex1 {

	public static void main(String[] args) {
		
		
		
		List<emp> l=new ArrayList<emp>();
		
		l.add(new emp("megha",20000));
		l.add(new emp("anu",40000));
		l.add(new emp("tanu",20000));
		l.add(new emp("manu",50000));
		Function<emp,Integer> f=i->
		{
			int salory=i.salory;
			if(salory>20000)
			{
				return salory*10/100;
			}
			else {
				return salory*5/100;
			}
		};
		
		for(emp e:l)
		{
			int bonus=f.apply(e);
			System.out.println(e.name+" "+e.salory);
			System.out.println("bonus is: "+bonus);
		}
		
		
		

	}

}
