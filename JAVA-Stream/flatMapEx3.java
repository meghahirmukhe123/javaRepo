package flatMap;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

//add object of collection and perform stream operation

class student{
	int id;
	String name;
	String city;
	char grade;
	
	//create constructor
	public student(int id,String name, String city, char grade)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		this.grade=grade;
	}
}


public class flatMapEx3 {

	public static void main(String[] args) {
		
		//create collection to store object of above cls
		List<student> l= new ArrayList<student>();
		l.add(new student (101,"megha","pune",'A'));
		l.add(new student (102,"anu","pune",'B'));
		l.add(new student (103,"raju","thane",'A'));
		l.add(new student (105,"anuradha","nashik",'c'));
		
		List<student> l2= new ArrayList<student>();
		l2.add(new student (106,"tony","pune",'A'));
		l2.add(new student (107,"raj","pune",'B'));
		l2.add(new student (108,"neela","thane",'A'));
		l2.add(new student (109,"kumar","nashik",'c'));
		
		
		//another way to add cls obj in collection
//		List<student> mylst= Arrays.asList(
//				new student (101,"megha","pune",'A'),
//				new student (102,"anu","pune",'B'),
//				new student (103,"raju","thane",'A'),
//				new student (103,"raju","thane",'A'),
//				new student (105,"anuradha","nashik",'c'));
				
		
		//pass this above collection to stream
		//create a huge collection to store above 2 collection
		List<List<student>> mainList=Arrays.asList(l,l2);
		
		//add this collection to stream
		//lets collect only names from above 2 collections and store in another collection
		List<String> onlyNames= new ArrayList<>();
		onlyNames=mainList.stream().flatMap(x->x.stream().map(n->n.name)).collect(Collectors.toList());
		
		//lets print only names from above collection
		System.out.println("names from above collection are: "+ onlyNames);
		
		System.out.println("____________________________________________");
		
		//lets collect id of all students
		
		List<Integer> allId= mainList.stream().flatMap(s->s.stream().map(ids-> ids.id)).collect(Collectors.toList());
		System.out.println("only id's of all students are: "+ allId);
		 
		
		
		

		
		
		

	}

}
