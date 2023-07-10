package dateAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;

//to find age of person

public class findAge {
	public static void main(String[] args)
	{
		
		//LocalDate birthday= LocalDate.of(year, month, day);
		LocalDate birthday= LocalDate.of(2001, 05, 03);
		LocalDate lt= LocalDate.now();

		//to find age we have to find years from 1990 to present
		Period p = Period.between(birthday, lt);
		System.out.printf("%d year-%d months- %d days",p.getYears(),p.getMonths(),p.getDays());
	
		
		
		
	}

}
