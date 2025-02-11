
public class sumEvenDigits {
	public static void main(String[] args) {

		System.out.println(getEvenDigitSum(123456789)); // 20
		System.out.println(getEvenDigitSum(252)); // 4
		System.out.println(getEvenDigitSum(-22)); // -1

	}

	public static int getEvenDigitSum(int num) {
		int digit, sum = 0;
		if (num >= 0) {
			while (num > 0) {
				digit = num % 10; // last one
				num /= 10; // make it to switch next digit of a num
				if (digit % 2 == 0 && digit > 0) {
					sum += digit;
				}
			}
			return sum;
		} else {
			return -1;
		}
	}
}
