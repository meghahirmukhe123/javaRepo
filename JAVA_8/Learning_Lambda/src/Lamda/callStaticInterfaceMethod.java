package Lamda;

//learning how to call interface static mathod


interface callStaticInterfaceMethod {
	
	public static void m1()
	{
		System.out.println("learning how to call interface static mathod");
	}

}


class test2{
	public static void main(String[] args)
	{
		callStaticInterfaceMethod.m1();
	}
}
