package Examples;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Ex:1=print those students whose name is starts with 'a' and ends with 't'
//EX:2=print those names where all letter are in uppercase
//EX:3=print those elements who is starts with as per user requirement.

public class filterMethod {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("EXAMPLE ONE: print those students whose name is starts with 'a' and ends with 't' ");
		System.out.println();
		System.out.println("enter total number of students: ");
		int num= sc.nextInt();
		Vector<String> v= new Vector<>();
		System.out.println("enter name(String) in vector: ");
		for(int i=0;i<num;i++)
		{
			v.add(sc.next());
		}
		System.out.println("given student are: ");
		for(String stu:v)
		{
			System.out.println(stu);
		}
		//lets only print answer using forEach 
		System.out.println("print using forEach: ");
		
		v.stream().filter(s->(s.startsWith("a") && s.endsWith("t"))).forEach(ans->System.out.println(ans));
		v.stream().filter(s->(s.startsWith("a") && s.endsWith("t"))).forEach(System.out::println);
		
		//lets store answer in another collection
		System.out.println("store in another collection: ");
		
		List<String> ans=v.stream().filter(x->x.startsWith("a") && x.endsWith("t")).collect(Collectors.toList());
		System.out.println(ans);
		
		System.out.println("_____________________________________________________________________________________________ ");
		System.out.println("EXAMPLE TWO:print those names where all letter are in uppercase");
		
		System.out.println();
		System.out.println("enter number of student: ");
		int n= sc.nextInt();
		List<String> l= new ArrayList<>();
		System.out.println("enter names: ");
		for(int i=0;i<n;i++)
		{
			l.add(sc.next());
		}
		System.out.println("student are: ");
		for(String name:l)
		{
			System.out.println(name);
		}
		System.out.println("name of student whose name is in uppercase are: ");
		l.stream().filter(x->x.equals(x.toUpperCase())).forEach(a->System.out.println(a));
		
		System.out.println("_____________________________________________________________________________________________ ");
		System.out.println("EXAMPLE Three:print those elements who is starts with as per user requirement. ");
		System.out.println("enter size of array: ");
		int size= sc.nextInt();
		String[] str= new String[size];
		System.out.println("enter character from which string will start and we will collect those elements: ");
		String ch= sc.next();
		System.out.println("enter string elements in array: ");
		for(int i=0;i<size;i++)
		{
			str[i]= sc.next();
		
		}
		System.out.println("given string array is: ");
		for(String str1:str)
		{
			System.out.println(str1);
		}
		
		//lets add this array elements in stream
		Stream<String> newStr= Stream.of(str);
		
		//lets perform operation 
		
		newStr.filter(x->x.startsWith(ch)).forEach(finalAns->System.out.println("name which are starts with: "+ch+" are:-"+finalAns));
		
		
		
		
		

	}

}
