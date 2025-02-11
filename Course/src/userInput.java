import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class userInput {
	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter user birthDay as '2000/12/30-12:00' : ");
		String userDate = scanner.nextLine();
		LocalDateTime birthDate = dateFormatter(userDate);

		for (int i = 0; i < 100; i++) {
			LocalDateTime currentDate = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
			
			int year = currentDate.getYear();
			boolean isLeap = isLeapYear(year);

			long ageInSeconds = ChronoUnit.SECONDS.between(birthDate, currentDate);

			double age = isLeap ? (double) ageInSeconds / 31_556_926 : (double) ageInSeconds / 31_622_400;

			System.out.println("Age : " + age);

			Thread.sleep(1000);
		}
		scanner.close();
	}

	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
	}

	public static LocalDateTime dateFormatter(String date) {
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd-HH:mm");
		LocalDateTime parsedDate = LocalDateTime.parse(date, inputFormatter);
		return parsedDate;
	}

}
