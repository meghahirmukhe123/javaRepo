package Lamda;


interface helloWorld {
	public void m1();

}

class test{
	public static void main(String[] args)
	{
		helloWorld h=()->System.out.println("helllloooo worldddd");
		h.m1();
	}
}
