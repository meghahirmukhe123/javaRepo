package methodRefernce;

public class constructorRef {
	public constructorRef()
	{
		System.out.println("learning constructor reference:");
	}
	
}

interface my
{
	public constructorRef getcons();
}

class mymain
{
	public static void main(String[] args)
	{
		my m=constructorRef::new;
		m.getcons();
	}
}
