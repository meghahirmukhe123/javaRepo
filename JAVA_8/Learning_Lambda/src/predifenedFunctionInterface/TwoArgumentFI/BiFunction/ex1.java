package predifenedFunctionInterface.TwoArgumentFI.BiFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

//take two object i.e. name and roll no. as input and return name and roll no.

class student{
	String name;
	int rollNo;
	
	public student(String name,int rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}
	
	
	public String toString()
	{
		String s= String.format(("%s,%d"),name,rollNo);
		return s;
		
	}
	
	
}

public class ex1 {
	public static void main(String[] args)
	{
		BiFunction<String,Integer,student> b=(name,rollNo)->new student(name,rollNo);
		
		List<student> l =new ArrayList<student>();
		
		//1st way
//		l.add(b.apply("megha", 12));
//		l.add(b.apply("tanu", 4));
//		l.add(b.apply("manu", 11));
//		l.add(b.apply("raju", 7));
//		
//		for(student s:l)
//		{
//			System.out.println("name is: "+ s.name);
//			System.out.println("roll no is: "+ s.rollNo);
//		}
		
		//2nd way
		l.add(new student("megha",12));
		l.add(new student("tanu",4));
		l.add(new student("manu",3));
		l.add(new student("raju",8));
		
		for(student s:l)
		{
			System.out.println(b.apply(s.name, s.rollNo));
		}
		
	}

}
