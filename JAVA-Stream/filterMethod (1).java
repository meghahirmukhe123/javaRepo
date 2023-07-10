package javaStream.filterExamples;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;
import java.util.List;
import java.util.ArrayList;


public class filterMethod {
	
	
		public static void main(String[] args) {
			// lets declare collection arraylist

	        // 1st way to add elements in arraylist
	        // ArrayList<Integer> num= new ArrayList<>();
	        // num.add(10);
	        // num.add(15);
	        // num.add(20);
	        // num.add(25);
	        // num.add(30);

	        // another way to add elements in list
	        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

	        // lets filter above data as per even number

	        // 1.create empty collection where we will store answer
	        List<Integer> l = new ArrayList<Integer>();

	        // with stream method lets filter the data and store in another collection

	        // 1. add collection into stream
	        l = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
	        //->to store in stream<-  ->predication<-            ->store in another collection<-
	        
	        System.out.println("l is:" + l);
	        System.out.println("___________________________________________________");
	        
	        //if dont want to store filter data in another collection and want to print directly
	        
	        numbers.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	        
	        System.out.println("___________________________________________________");
	        
	        //another way to print directly using for each
	        numbers.stream().filter(n->n%2==0).forEach(System.out::println);
			
			
		}
		

	}


