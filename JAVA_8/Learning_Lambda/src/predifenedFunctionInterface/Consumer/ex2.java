package predifenedFunctionInterface.Consumer;


//combine prdicate+function+consumer
//calculate bonus.if bonus>5000 print all data of emp

import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.ArrayList;

class emp{
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
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of emp: ");
		int num = sc.nextInt();
		
		
		List<emp> l= new ArrayList<>();
		for(int i=0;i<num;i++)
		{
			System.out.println("enter name: ");
			String name= sc.next();
			System.out.println("enter salory: ");
			int salory=sc.nextInt();
			System.out.println("enter dept: ");
			String dept=sc.next();
			
			l.add(new emp(name,salory,dept));
		}
		
		//first find 10% bonus of each employee
		Function<emp,Integer> f= i->(i.salory*10)/100;
		
		//check condition if bonus is greater than 5000
		
		Predicate<Integer> p= j->j>=5000;
		
		//to get all data
		Consumer<emp> e= s->System.out.println(s.name+" "+s.salory+" "+s.dept);
		
		for(emp e1:l)
		{
			
			int bonus= f.apply(e1);
			if(p.test(bonus))
			{
				e.accept(e1);
				System.out.println(bonus);
			}
			
		}
		
		
		
		
		
		
		
		

	}

}
