package predifenedFunctionInterface.Function;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.ArrayList;
//if salory is <3500 increment it by 477

class emp2
{
	String name;
	String dept;
	int salory;
	
	public emp2(String name,String dept,int salory)
	{
		this.name=name;
		this.dept=dept;
		this.salory=salory;
	}
}

public class ex7 {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number of emp: ");
		int n= sc.nextInt();
		List<emp2> l= new ArrayList<>();
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter name of emp: "+i);
			String name= sc.next();
			System.out.println("enter dept of emp: "+i);
			String dept= sc.next();
			System.out.println("enter salory of emp: "+i);
			int salory= sc.nextInt();
			
			l.add(new emp2(name,dept,salory));
		}
		
		//to check condition <3500
		Predicate<emp2> pr= i->i.salory<3500;
		
		//to increase salory
		Function<emp2,Integer> f= j->j.salory+477;
		
		for(emp2 em:l)
		{
			if(pr.test(em))
			{
				System.out.println(em.name+" "+em.dept+" "+em.salory+" new salory is: "+f.apply(em));
			}
		}
			
		
	}

}
