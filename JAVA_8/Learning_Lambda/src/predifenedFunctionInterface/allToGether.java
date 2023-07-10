package predifenedFunctionInterface;
//use predicate,consumer,function together
//get marks of student acc to that give grade. and who have grade 'a' print all info of that student

import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.ArrayList;

class clsStu{
	String name;
	String std;
	int marks;
	
	public clsStu(String name,String std,int marks)
	{
		this.name=name;
		this.std=std;
		this.marks=marks;
	}
}

public class allToGether {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no. of students");
		int n=sc.nextInt();
		
		List<clsStu> l= new ArrayList<>();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter name: "+i);
			String name= sc.next();
			System.out.println("enter std: ");
			String std= sc.next();
			System.out.println("enter marks: ");
			int marks= sc.nextInt();
			l.add(new clsStu(name,std,marks));
		}
		
		//predicate to check marks >60
		Predicate<clsStu> cl= i->i.marks>60;
		
		//to give grade acc. to marks
		 Function<clsStu, Character> f= j->
		 {
			 int mark= j.marks;
			 if(mark > 75)
			 {
				 return 'a';
			 }
			 else {
				 return 'b';
			 }
			  
		 };
		 
		 //to print all info
		 Consumer<clsStu> c= i->
		 {
			 System.out.println("name is: "+i.name);
			 System.out.println("marks is: "+i.marks);
			 System.out.println("std is: "+i.std);
			 
			 
		 };
		 
		 for(clsStu cls:l)
		 {
			 c.accept(cls);
			 System.out.println("grade is: "+f.apply(cls));
			 System.out.println();
		 }

	}

}
