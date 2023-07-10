package predifenedFunctionInterface.TwoArgumentFI.BiFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

//find monthly salory of emp acc. to working hours


class emp
{
	String name;
	int spd;   //salory per day
	int days;
	
	public emp(String name,int spd,int days)
	{
		this.name=name;
		this.spd=spd;
		this.days=days;
	}
}
public class ex2 {

	public static void main(String[] args) {
		
		List<emp> l=new ArrayList<>();
		l.add(new emp("raju",300,20));
		l.add(new emp("ramu",300,29));
		l.add(new emp("kiran",250,19));
		l.add(new emp("kaka",300,23));
		l.add(new emp("tanu",300,17));
		
		BiFunction<emp, emp, Double> b= (e,t)->
		{
		 	double salory=e.spd*t.days;
		 	return salory;
		};
		
		for(emp e:l)
		{
			System.out.println("monthly salory of: "+e.name+" is : "+b.apply(e, e));
		}
	}

}
