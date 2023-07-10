package predifenedFunctionInterface.Function;

//if student got more than 35 then change std to std+1 if not then print name+std+marks
import java.util.*;
import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;

class stu{
	String name;
	int std;
	int marks;
	
	public stu(String name,int std,int marks)
	{
		this.name=name;
		this.std=std;
		this.marks=marks;
	}
}

public class ex2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total no. of students: ");
		int total = sc.nextInt();
		List<stu> s= new ArrayList<>();
		System.out.println("enter details of student");
		for(int i=0;i<total;i++)
		{
			System.out.println("enter name: ");
			String name= sc.next();
			System.out.println("enter std: ");
			int std= sc.nextInt();
			System.out.println("enter marks: ");
			int marks= sc.nextInt();
			
			s.add(new stu(name,std,marks));
		}
		
		Predicate<stu> p= i->i.marks>35;
		
		for(stu j:s)
		{
			if(p.test(j))
			{
				System.out.println("name is: "+j.name+" marks is: "+j.marks+" old std is: "+j.std+" new std is: "+(j.std+1));
			}
			else {
				System.out.println("name is : "+j.name+" marks is: "+j.marks+" std is: "+j.std+" fail.as marks are less than 35");
			}
		}

	}

}
