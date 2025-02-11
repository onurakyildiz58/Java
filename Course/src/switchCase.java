
public class switchCase {

	public static void main(String[] args) {
		int value = 1;

		switch (value) {
		case 1:
			System.out.println(value);
			break;
		case 2:
			System.out.println(value);
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(value);
			break;
		default:
			System.out.println("Unexpected value: " + value);
		}

		switch (value) {
		case 6 -> System.out.println(value);
		case 7, 8, 9 -> System.out.println(value);
		default -> System.out.println("Unexpected value: " + value);
		}

		System.out.println(getSeason("february"));
	}

	public static String getSeason(String month) {
		return switch (month) {
		case "june", "july", "august" -> { yield "Summer"; }
		case "september", "october", "november" -> { yield "Fall"; }
		case "december", "january", "february" -> {	yield "Winter"; }
		case "march", "april", "may" -> { yield "Spring"; }
		default -> { yield month + " isn't valid"; }
		};
	}
}
