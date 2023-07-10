package predifenedFunctionInterface.Predicate;
import java.util.*;
import java.util.function.Predicate;


//if student got >35 then print name of that student+"fail" msg

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
public class ex3 {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total no. of students: ");
		int no=sc.nextInt();
		List<stu> l=  new ArrayList<>();
		for(int i=0;i<no;i++)
		{
			System.out.println("enter name: ");
			String name= sc.next();
			System.out.println("enter std: ");
			int std= sc.nextInt();
			System.out.println("enter marks: ");
			int marks= sc.nextInt();
			
			l.add(new stu(name,std,marks));
		}
		
		
		Predicate<stu> p=i->i.marks<35;
		
		for(stu s:l)
		{
			if(p.test(s))
			{
				System.out.println(s.name+" is fail.has marks "+s.marks);
			}
		}
		
	}

}
