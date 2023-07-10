package Lamda;
import java.util.*;
public interface addition {
	
	public void add(int a,int b);

}

class myclass{
	public static void main(String[] args)
	{
		
		addition ans=(int a,int b)->System.out.println((a+b));
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		ans.add(x, y);
	}
}
