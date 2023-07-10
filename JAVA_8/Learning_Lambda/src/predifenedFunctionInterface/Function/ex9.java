package predifenedFunctionInterface.Function;

import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.ArrayList;
//check first 5 letters of username should be hello .remainig characters can be anything. password should be 'java'


public class ex9 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter username");
		String username= sc.next();
		System.out.println("enter password: ");
		String password= sc.next();
		
		//1st function to check first 5 letters of username
		Function<String,String> f1= i->i.substring(0, 5);
		
		//2nd function to check password should be java
		Function<String,String> f2= j->j.toLowerCase();
		
		//combine both functions
		if(f1.andThen(f2).apply(username).equals("hello") && password.equals("java"))
		{
			System.out.println("valid user: ");
		}
		else {
			System.out.println("invalid user");
		}
	
		
		
		

	}

}
