package javaStream.MAP;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//perform map and filter method both
class emp
{
	int id;
	String fname;
	String lname;
	int salory;
	
	emp(int id,String fname,String lname,int salory)
	{
		this.id= id;
		this.fname=fname;
		this.lname=lname;
		this.salory=salory;
	}
}
public class mapAndFilter {
	public static void main(String[] args) {
		
		//add object of class in collection
		List<emp> e= Arrays.asList(
				new emp(101,"negha","mukhe",20000),
				new emp(102,"anu","mukhe",10000),
				new emp(103,"raju","mukhe",30000),
				new emp(104,"priya","mukhe",40000),
				new emp(104,"mohit","mukhe",50000)
				);
		
		
		List<Integer> mylst= e.stream().filter(s-> s.salory > 20000).map(s-> s.salory*2).collect(Collectors.toList());
		System.out.println(mylst);
						
				
				
				
			
		
	}

}
