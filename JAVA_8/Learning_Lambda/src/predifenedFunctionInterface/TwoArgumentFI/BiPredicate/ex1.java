package predifenedFunctionInterface.TwoArgumentFI.BiPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

//provide marks of 2 subjects.if avg if >35 print pass else fail
class marks{
	int m1;
	int m2;
	
	public marks(int m1,int m2)
	{
		this.m1=m1;
		this.m2=m2;
	}
}
public class ex1 {
	
	public static void main(String[] args)
	{
		BiPredicate<Integer,Integer> x= (a,b)->((a+b)/2)>35;
		
		List<marks> l= new ArrayList<>();
		l.add(new marks(35,46));
		l.add(new marks(30,40));
		l.add(new marks(25,46));
		l.add(new marks(15,34));
		
		
		for(marks m:l)
		{
	
			if(x.test(m.m1, m.m2))
			{
				System.out.println("m1 is: "+m.m1+" m2 is : "+m.m2+" result is: pass");
			}
			else {
				System.out.println("m1 is: "+m.m1+" m2 is : "+m.m2+" result is: fail");
			}
		}
	}

}
