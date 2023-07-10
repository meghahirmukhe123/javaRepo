package predifenedFunctionInterface.supplier;

import java.util.function.Supplier;

//generate random password try2

public class ex4 {

	public static void main(String[] args) {
		Supplier<String> str=()->
		{
			String mypswrd="";
			String chars="abcdefghijklmnopqrstuvwxyz@*#";
			//get random from 0-9
			Supplier<Integer> ints= ()->(int)(Math.random()*10);
			
			//to get random characters
			
			Supplier<Character> ch= ()->chars.charAt((int)(Math.random()*29));
			
			//password should of 10 characters.so for loop will start from 0-9 or 1-10
			for(int i=0;i<9;i++)
			{
				//at even index there should be character
				if(i%2==0)
				{
					mypswrd=mypswrd+ch.get();
				}
				
				//in odd place there should be integers
				else
				{
					mypswrd=mypswrd+ints.get();
				}
			}
			return mypswrd;
			
			
		};
		
		System.out.println(str.get());
		System.out.println(str.get());
		System.out.println(str.get());
	}

}
