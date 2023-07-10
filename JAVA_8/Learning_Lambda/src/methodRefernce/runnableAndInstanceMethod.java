package methodRefernce;

public class runnableAndInstanceMethod {
	public void m1()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("learning object refernce");
		}
	}
	public static void main(String[] args)
	{
		runnableAndInstanceMethod obj= new runnableAndInstanceMethod();
		//as m1 is instance method we can call it by using object reference.
		//m1 has 0 argument and runnable's run method also has 0 argument.so r referes m1
		Runnable r= obj::m1; 
		Thread t= new Thread(r);
		t.start();  //till here two threads are created.main thread and child thread.
		//child thread will print "learning object refernce" and main thread will print below statement
		for(int j=0;j<10;j++)
		{
			System.out.println("child thread");
		}
		
		
		
	}

}
