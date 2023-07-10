package flatMap;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class flatMapEx1 {

	public static void main(String[] args) {
		
		//using map
		List<Integer> l= Arrays.asList(1,2,3,4,5);
		List<Integer> ans1= l.stream().map(n-> n*5).collect(Collectors.toList());
		System.out.println("using map: "+ans1);
		
		System.out.println("___________________________________");
		
		//using flatmap
		
		List<Integer> l1= Arrays.asList(10,20);
		List<Integer> l2= Arrays.asList(30,40);
		List<Integer> l3= Arrays.asList(50,60);
		
		//to add all above 3 collection use flatMap
		
		List<List<Integer>> ans= Arrays.asList(l1,l2,l3);
		
		List<Integer> finalAns=ans.stream().flatMap(x-> x.stream()).collect(Collectors.toList());
		//                             ->take one collection obj then added to stream <-
		
		System.out.println("using flatmap answer is :"+ finalAns);
		
		
		System.out.println("___________________________________");
		
		//lets perform some operation on this given complex collection
	
		//multiply each collection element with 10
		
		List<Integer> flatMapAns=ans.stream().flatMap(x->x.stream().map(n->n*10)).collect(Collectors.toList());
		System.out.println("after opeation on flatMap: "+ flatMapAns);
		
	
		

	}

}
