package methodRefernce;

public interface nonstatic {
	public void m1();

}

class nstatic
{
	public void m2()
	{
		System.out.println("referring non static method");
	}
	
	public static void main(String[] args)
	{
		//as method is non static we need to create object of class
		nstatic n= new nstatic();
		nonstatic ns= n::m2;
		ns.m1();
	}
}
