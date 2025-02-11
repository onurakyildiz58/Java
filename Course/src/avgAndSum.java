import java.util.Scanner;

public class avgAndSum {
	public static void main(String[] args) {

		inputThenPrintSumAndAverage();
	}

	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int loopCount = 0;
		
		while(true) {
			System.out.print("enter number : ");
			String entry = scanner.nextLine();
			try {
				int num = Integer.parseInt(entry);
				loopCount++;
				sum += num;
			} catch (Exception e) {
				break;
			}
			
		}
		long avg = (loopCount > 0) ? Math.round((double) sum / loopCount) : 0;
		System.out.println("SUM = " + sum + " AVG = " + avg);
		scanner.close();
	}
}
