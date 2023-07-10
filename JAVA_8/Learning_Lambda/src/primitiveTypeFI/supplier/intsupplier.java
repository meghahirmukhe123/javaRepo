package primitiveTypeFI.supplier;

import java.util.function.IntSupplier;

//generate random 6 digit OTP
public class intsupplier {
	
	public static void main(String[] args)
	{
		IntSupplier j=()->(int)(Math.random()*10);
		
		String otp="";
		for(int i=0;i<6;i++)
		{
			
			otp=otp+j.getAsInt();
		}
		
		System.out.println("otp is: "+otp);
		
	}

}
