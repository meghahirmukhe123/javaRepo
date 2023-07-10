package Lamda;

//case:we have 2 interface having method of same name.trying how to override that
interface overrideDefaultMethod {
	default void m1()
	{
		System.out.println("this is first default method");
	}

}

interface intf2{
	default void m1()
	{
		System.out.println("this is second default method");
	}
}

class check implements overrideDefaultMethod,intf2{
	
	//to call first interface method
	public void m1()
	{
		intf2.super.m1();
	}
	
	
	public static void main(String[] args)
	{
		check c=new check();
		c.m1();
	}
}
