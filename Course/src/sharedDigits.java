
public class sharedDigits {

	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 23));
		System.out.println(hasSharedDigit(99, 9));
		System.out.println(hasSharedDigit(15, 55));
	}

	public static boolean hasSharedDigit(int num1, int num2) {
		if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false; // Ensure both numbers are two-digit numbers
        }

        int digit1Left = num1 / 10;
        int digit1Right = num1 % 10;
        int digit2Left = num2 / 10;
        int digit2Right = num2 % 10;

        return digit1Left == digit2Left || digit1Left == digit2Right ||
               digit1Right == digit2Left || digit1Right == digit2Right;
	}
}
