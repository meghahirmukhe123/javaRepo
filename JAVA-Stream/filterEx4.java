package javaStream.filterExamples;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//object store in collection.use filter method on it

class product{
	int id;
	String name;
	double price;
	
	//create constructor
	public product(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
}

public class filterEx4 {

	public static void main(String[] args) {
		
		//create collection which collect object of product class
		
		List<product> productList= new ArrayList<>();
		
		
		productList.add(new product(101,"oil",50.20));
		productList.add(new product(102,"rice",20.00));
		productList.add(new product(103,"pen",05.10));
		productList.add(new product(104,"book",50.00));
		productList.add(new product(105,"wheat",40.20));
		
		//que:filter the data on basis of price of product
		
		//add those product whose price is greater than 20.00 add in another collection
		
	    productList.stream().filter(n-> n.price>20.00).forEach(n->System.out.println(n.price));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
