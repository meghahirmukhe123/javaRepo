package Lamda;


public class hello
{
	  public static void main(String[] args) {
	        Runnable helloWorld = () -> System.out.println("Hello World!");
	        helloWorld.run();
	    }
}