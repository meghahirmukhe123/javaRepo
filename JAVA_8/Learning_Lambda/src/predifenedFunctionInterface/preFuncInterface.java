package predifenedFunctionInterface;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//basix examples of all predifined functional interfaces
//1.predicate
//2.consumer
//3.supplier
//4.function
public class preFuncInterface {
	public static void main(String[] args)
	{
		//A]predicate(test)
		
		//ex1:check number is greater than 10 or not
		
		Predicate<Integer> p=i->(i>10);
		System.out.println(p.test(9));
		
		//ex:2 check length is greater than 4 or not
		Predicate<String> str=i->(i.length()>4);
		System.out.println(str.test("megha"));
		
		
		//ex3:print those string from array whose array is greater than3
		String[] arr= {"tanu","cat","manu","dog"};
		Predicate<String> arrp=j->(j.length()>3);
		for(String n:arr)
		{
			if(arrp.test(n))
			{
				System.out.println(n);
			}
		}
		
		//predicate .isEquals method
		Predicate<String> pr= Predicate.isEqual("hello");
		System.out.println(pr.test("hello"));  ///it will give true
		System.out.println(pr.test("world"));  //it will give false
		
		
		
		//B]Function
		
		
		//ex1:square of given number
		Function<Integer,Integer> f=i->i*i;
		System.out.println(f.apply(3));
		System.out.println(f.apply(6));
		
		//ex2:find length of string
		
		Function<String,Integer> fi=l->l.length();
		System.out.println("length is: "+fi.apply("hello world"));
		
		//identity function in function
		Function<String,String> f2= Function.identity();   //we have called identity by Function as it is static function
		System.out.println(f2.apply("this is identity function.and it is static"));
		
		
		//c]Consumer(it will not return any value.it will just take input make some operations but not return anything
		
		Consumer<String> s= k-> System.out.println(k);
		
		s.accept("learning consumer predefined functoinal interface");
		s.accept("yes.ICDI");
		//D]Supplier
		
		Supplier<Date> d= ()->new Date();
		
		System.out.println(d.get());
		
	}

}
