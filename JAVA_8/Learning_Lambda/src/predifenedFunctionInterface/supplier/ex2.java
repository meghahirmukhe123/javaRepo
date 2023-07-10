package predifenedFunctionInterface.supplier;

import java.util.function.Supplier;

//generate 6 digit random OTP using supplier

public class ex2 {
	public static void main(String[] args)
	{
		
		Supplier<String> str= ()->
		{
			String otp="";
			for(int i=0;i<6;i++)
			{
				//we have multiply by 10 because after multiplication range will be 0<x<9.max number will be 9
				otp=otp+(int)(Math.random()*10); 
				
			}
			return otp;
			
		};
		
		System.out.println(str.get());
		System.out.println(str.get());
	}

}
