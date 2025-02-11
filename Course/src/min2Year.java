
public class min2Year {

	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);
	}
	
	public static void printYearsAndDays(long minutes) {
		if(minutes <= 0) {
			System.out.println("Invalid Value");
		}else {
			long years, days, hour;
			hour = minutes / 60; // how many hours in that minutes
			days = hour / 24; // how many days in that hours
			years = days / 365;
			days = days % 365;
			System.out.println(minutes + " min = " + years + " y and " + days + " d");
		}
	}
}
