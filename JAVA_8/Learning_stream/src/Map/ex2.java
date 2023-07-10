package Map;

import java.util.Arrays;
import java.util.List;

//convert 0th index character of string to uppercase
public class ex2 {
	public static void main(String[] args)
	{
		List<String> str= Arrays.asList("hello","world","megha");
		
		str.stream().map(x->x.substring(0, 1).toUpperCase()+x.subSequence(1, x.length())).forEach(z->System.out.println(z));
		
	}

}
