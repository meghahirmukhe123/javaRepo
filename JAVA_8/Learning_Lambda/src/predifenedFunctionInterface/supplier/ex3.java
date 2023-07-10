package predifenedFunctionInterface.supplier;

import java.util.function.Supplier;

//create a random password which has length=8, in even places it has characters or @ or # or $.in odd places there should be number

public class ex3 {

	public static void main(String[] args) {
		
		Supplier<String> str= ()->
		{
			//password is empty
			String pwd="";
			//take all characters
			String ch="ABCDEFGHIJKLMNOPQRSTUVWXYZ@$#";
			//take random digit from 0-9
			Supplier<Integer> d= ()->(int)(Math.random()*10);
			//take a index for placing charaters
			Supplier<Character> c=()->ch.charAt((int)(Math.random()*29));
			
			for(int i=0;i<8;i++)
			{
				if(i%2==0)
				{
					pwd=pwd+d.get();
				}
				else {
					pwd=pwd+c.get();
				}
			}
			
			return pwd;
		};
		
		System.out.println(str.get());

	}

}
