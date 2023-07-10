package predifenedFunctionInterface.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//find grade accorting to marks
class student{
	String name;
	String std;
	int marks;
	
	public student(String name,String std,int marks)
	{
		this.name=name;
		this.std=std;
		this.marks= marks;
		}
	}
public class ex5 {

	public static void main(String[] args)
	{
		List<student> l= new ArrayList<>();
		l.add(new student("megha","10th",70));
		l.add(new student("anu","10th",23));
		l.add(new student("tanu","10th",35));
		l.add(new student("raj","10th",89));
		
		Function<student,String> f= j->{
			
			if(j.marks>=85)
			{
				return "A";
			}
			else if(85 > j.marks && j.marks>=35)
			{
				return "B";
			}
			else {
				return "fail";
			}
		};
		
		for(student st:l)
		{
			System.out.println(st.name+" "+st.marks+" "+f.apply(st));
		}
	}

}
