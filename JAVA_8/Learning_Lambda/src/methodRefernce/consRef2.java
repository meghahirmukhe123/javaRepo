package methodRefernce;

//constructor reference ex2
public interface consRef2 {
	
	public void m1();
}

class stu
{
	//constructor of stu
	public stu()
	{
		System.out.println("this is stu constructor");
	}
	
	public void m2()
	{
		System.out.println("this is just a method");
	}
}

class clsmain
{
	public static void main(String[] args)
	{
		consRef2 c= stu::new;
		c.m1();
	}
}
