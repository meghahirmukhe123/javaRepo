package predifenedFunctionInterface.Consumer;

//consumer will take object and it will print all the information related to it

import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;
class film
{
	String fname;
	int tprice;
	String DOR;
	
	public film(String fname,int tprice,String DOR)
	{
		this.fname=fname;
		this.tprice=tprice;
		this.DOR=DOR;
	}

}

public class ex4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of films");
		int n= sc.nextInt();
		List<film> f= new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter fname: ");
			String fname= sc.next();
			System.out.println("enter tprice: ");
			int tprice= sc.nextInt();
			System.out.println("enter date of release");
			String DOR= sc.next();
			
			f.add(new film(fname,tprice,DOR));
		}
		
		Consumer<film> c=i->System.out.println("film name is: "+i.fname+" tikcet price is : "+i.tprice+" date of release is: :" +i.DOR);
		for(film fl:f)
		{
			c.accept(fl);
		}
		
		 

	}

}
