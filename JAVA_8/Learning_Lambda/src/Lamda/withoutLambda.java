package Lamda;

public interface withoutLambda {

	public void m1();
}

class test1 implements withoutLambda{
	public void m1()
	{
		System.out.println("without using lambda expression");
	}
}

class mainclass{
	public static void main(String[] args)
	{
		withoutLambda w= new test1();
		w.m1();
	}
}