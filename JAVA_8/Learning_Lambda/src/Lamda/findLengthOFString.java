package Lamda;

public interface findLengthOFString {
	public int m1(String s);

}

class ans{
	public static void main(String[] args)
	{
		findLengthOFString f=(s)->s.length();
		System.out.print(f.m1("megha"));
		
	}
}
