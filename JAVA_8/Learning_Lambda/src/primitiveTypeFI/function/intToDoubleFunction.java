package primitiveTypeFI.function;

import java.util.function.IntToDoubleFunction;

//find sqrt of given number
public class intToDoubleFunction {

	public static void main(String[] args) {
		
		IntToDoubleFunction i=j->Math.sqrt(j);
		
		System.out.println(i.applyAsDouble(16));  //apply as double not int because we want ans in double type

	}

}
