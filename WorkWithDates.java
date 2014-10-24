import java.util.Calendar;
import java.util.*;

public class WorkWithDates {
	public static void main(String[] args)  {
		Calendar cal = Calendar.getInstance();
		System.out.println("Time in milliseconds: " + cal.getTimeInMillis());
		System.out.println("Time: " + cal.getTime());
		System.out.println("Hour of day: " + cal.get(cal.HOUR_OF_DAY));
		System.out.println("Day of week: " + cal.get(cal.DAY_OF_WEEK));
		System.out.println("Week of year: " + cal.get(cal.WEEK_OF_YEAR));
		System.out.println("Date: " + cal.get(cal.DATE));
		System.out.println("Month: " + cal.get(cal.MONTH));
		System.out.println("Year: " + cal.get(cal.YEAR));
		System.out.println("-----Adding one day-----");
		cal.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println("New Date: " + cal.get(cal.DATE));
		System.out.println("Hour of day: " + cal.get(cal.HOUR_OF_DAY));

		Properties props = System.getProperties();

		for(Map.Entry entry : props.entrySet()) {
			System.out.println("Key=" + entry.getKey() + ", Value=" + entry.getValue());
		}
	}
}