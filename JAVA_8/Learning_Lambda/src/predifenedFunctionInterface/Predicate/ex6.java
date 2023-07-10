package predifenedFunctionInterface.Predicate;
//create user authentication using predicate
import java.util.*;
import java.util.function.Predicate;


class user{
	String username;
	String password;
	
	public user(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	
	
}
public class ex6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		List<user> l= new ArrayList<>();
		System.out.println("enter total number of users");
		int num= sc.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("enter username: ");
			String username=sc.next();
			System.out.println("enter password");
			String password= sc.next();
			
			l.add(new user(username,password));
		}
		System.out.println("enter uname to check");
		String uname= sc.next();
		System.out.println("enter password to check");
		String password= sc.next();
		Predicate<user> p= i->i.username.equals(uname) && i.password.equals(password);
		for(user u:l)
		{
			if(p.test(u))
			{
				System.out.println(u.username+" "+u.password);
			}
			
			
			
		}

	}

}
