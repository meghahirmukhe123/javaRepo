package Lamda;

public class runnableMethod {
	public static void main(String[] args)
	{
		//ex1:
//		Runnable r=()->System.out.println("learning via runnable method");
//		
//		r.run();
		
		//ex2: 
		Runnable r= ()->
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("hello runnable method:");
			}
		};
		
		r.run();
	}

}
