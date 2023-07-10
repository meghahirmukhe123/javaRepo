package streamMethods;

import java.util.Arrays;
import java.util.List;

public class count {

	public static void main(String[] args) {
		
		List<Integer> l= Arrays.asList(12,45,6,7,8,9,23,34);
		
		long ans= l.stream().count();
		System.out.println("length of l is: "+ans);
		
	}

}
