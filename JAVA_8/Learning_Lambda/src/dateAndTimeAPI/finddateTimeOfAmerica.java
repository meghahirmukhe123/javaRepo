package dateAndTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class finddateTimeOfAmerica {

	public static void main(String[] args)
	{
		ZoneId z= ZoneId.systemDefault();
		System.out.println("default zone is: "+z);
		
		ZoneId la= ZoneId.of("Asia/Calcutta");
		ZonedDateTime zt= ZonedDateTime.now(la);
		System.out.println(zt);
	}
}
