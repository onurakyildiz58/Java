
public class factors {
	public static void main(String[] args) {
		printFactors(6);
		System.out.println(printGreatestCommonFactors(25, 15));
		System.out.println(isPerfectNumber(6));
	}

	public static void printFactors(int number) {
		if (number > 1) {
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					System.out.println(i);
				}
			}
			System.out.println(" ");
		} else {
			System.out.println("Invalid Value");
		}
	}

	public static int printGreatestCommonFactors(int num1, int num2) {
		if (num1 > 9 && num2 > 9) {
			while (num1 != 0) {
				int temp = num1;
				num1 = num2 % num1;
				num2 = temp;
			}
			return num2;
		} else {
			return -1;
		}
	}

	public static boolean isPerfectNumber(int number) {
		if (number < 2) {
            return false; // Perfect numbers must be greater than 1
        }

        int sum = 1; // Start with 1 because it's always a divisor
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) { // Avoid adding the square root twice
                    sum += number / i;
                }
            }
        }

        return sum == number;
	}
}
