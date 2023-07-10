package predifenedFunctionInterface.Function;

import java.util.function.Function;

//remove spaces from sentence with the help of funtion
public class ex4 {

	public static void main(String[] args) {
		String str="hello i am megha";
		
		Function<String,String> s= i->i.replace(" ", "");
		System.out.println(s.apply(str));
		

	}

}
