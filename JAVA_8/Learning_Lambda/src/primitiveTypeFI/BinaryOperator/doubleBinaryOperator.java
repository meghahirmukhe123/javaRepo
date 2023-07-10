package primitiveTypeFI.BinaryOperator;

import java.util.function.DoubleBinaryOperator;

public class doubleBinaryOperator {
	public static void main(String[] args)
	{
		double[] d= {4.0,7.0,3.5,4.2};
		
		DoubleBinaryOperator db= (a,b)->a+b;
		for(double x:d)
		{
			System.out.println(db.applyAsDouble(x,x));
		}
	}

}
