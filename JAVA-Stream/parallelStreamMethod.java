package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class emp
{
	String name;
	int salory;
	
	public emp(String name,int salory)
	{
		this.name=name;
		this.salory=salory;
	}
}

public class parallelStreamMethod {

	public static void main(String[] args) {
		
		List<emp> l= Arrays.asList(
				new emp("abc",12000),
				new emp("def",2000),
				new emp("ghi",40000),
				new emp("jkl",1000),
				new emp("mno",100)
			);
		
		//multiply salory by 2
		l.parallelStream().map(x->x.salory*2).forEach(ans-> System.out.println(ans));
		
		


		

	}

}
