
public class lastDigits {
	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(41, 22, 71));
		System.out.println(hasSameLastDigit(23, 32, 42));
		System.out.println(hasSameLastDigit(9, 99, 999));
		System.out.println(hasSameLastDigit(88, 99, 777));
	}

	public static boolean isValid(int num) {
		return num <= 1000 && num >= 10;
	}

	public static boolean hasSameLastDigit(int num1, int num2, int num3) {
		if (isValid(num1) && isValid(num2) && isValid(num3)) {
			num1 = num1 % 10;
			num2 = num2 % 10;
			num3 = num3 % 10;
			
			return num1 == num2 || num1 == num3 || num2 == num3;
		} else {
			
			return false;
		}
	}
}
