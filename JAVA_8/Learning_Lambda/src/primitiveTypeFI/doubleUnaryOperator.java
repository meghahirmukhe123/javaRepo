package primitiveTypeFI;

import java.util.function.DoubleUnaryOperator;

public class doubleUnaryOperator {
	public static void main(String[] args) {
		
		DoubleUnaryOperator d= i->(i*2)/4;
		double[] arr= {1.0,2.0,3.0,4.0,5.0};
		
		for(double x:arr)
		{
			System.out.println(d.applyAsDouble(x));
		}
		
		
	
	}

}
