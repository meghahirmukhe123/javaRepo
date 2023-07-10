package Lamda;

public class annonymousInnerClass {
	public static void main(String[] args)
	{
		Runnable r=()->
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("hello anonymous inner class");
			}
		};
		
//		Thread t= new Thread(r);
//	    t.start();
		r.run();
				
	}

}
