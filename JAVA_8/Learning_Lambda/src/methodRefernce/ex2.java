package methodRefernce;

public interface ex2 {
	
	public abstract void m1(int a);  //if we have not return abstract keyword it will be ok

}

class mref
{
	public static void m2(int b)
	{
		System.out.println("hello,welcome");
		System.out.println("learning method reference");
	}
	
	public static void main(String[] args)
	{
		ex2 e=mref::m2;
		e.m1(0);
	}
}