package predifenedFunctionInterface.Predicate;

import java.util.function.Predicate;

//remove null object and empty strings from array

public class ex5 {

	public static void main(String[] args) {
		
		String[] str= {"megha","",null,"","anu","tanu"};
		
		Predicate<String> s= i->i !=null && i.length() !=0;
		
		for(String st:str)
		{
			if(s.test(st))
			{
				System.out.println(st);
			}
		}

	}

}
