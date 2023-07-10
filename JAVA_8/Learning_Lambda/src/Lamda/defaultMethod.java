package Lamda;

//just created default method
interface defaultMethod {
	default void m1()
	{
		System.out.println("just learning how to create default method");
	}
	

}

class defaultans implements defaultMethod {
	public static void main(String[] args)
	{
		defaultMethod d= new defaultans();
		d.m1();
	}
}
