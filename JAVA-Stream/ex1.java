package parallelStream;
import java.util.*;

//print top 3 student name and score whose score is greater than 80

class stu
{
	String name;
	int score;
	
	//create constructor
	public stu(String name,int score)
	{
		this.name=name;
		this.score=score;
	}
}

public class ex1 {

	public static void main(String[] args) {
		
		List<stu> l= Arrays.asList(
				new stu("megha",82),
				new stu("abhi",88),
				new stu("anu",75),
				new stu("tanu",65),
				new stu("meena",80),
				new stu("rani",89)
				);
		
		//1.usinh stream
		
		//lets print all student whose score is more than and equal to 80
		System.out.println("student whose score is more than 80 are: ");
		l.stream().filter(s->s.score>=80).forEach(ans->System.out.println(ans.name+" "+ans.score));
		
		System.out.println("___________________________________________________________________________");
		

		//lets print top 3 student whose score is more than and equal to 80
		System.out.println("top 3 students whose score is more than 80 are: ");
		
		l.stream().filter(s->s.score>=80).limit(3).forEach(ans->System.out.println(ans.name+" "+ans.score));
		
		
		//2.using parallel stream
		
		System.out.println("___________________________________________________________________________");
		System.out.println("using parallel stream: ");
		
		//1st way of using parallel stream
		l.parallelStream().filter(s->s.score>=80).limit(3).forEach(ans->System.out.println(ans.name+" "+ans.score));
		
		System.out.println();
		
		//2nd way of using parallel stream
		
		l.stream().parallel().filter(s->s.score>-80).limit(3).forEach(ans->System.out.println(ans.name+" "+ans.score));
				
				
				
				
				
				



	}

}
