package dateAndTimeAPI;

import java.time.LocalTime;

public class getOwnTimeFormat {

	public static void main(String[] args)
	{
		LocalTime t=LocalTime.now();
		System.out.println("time is: "+t);
		
		int hr= t.getHour();
		int min=t.getMinute();
		int sec= t.getSecond();
		int nanosec=t.getNano();
	
		
		//if we want to get time in format of hr::min::sec::nanosecond
		System.out.printf("%d::%d::%d::%d",hr,min,sec,nanosec);
	}
}
