
public class oddEven {

	public static void main(String[] args) {
		System.out.println(sumOdd(1, 100)); 		// 2500
		System.out.println(sumOdd(-1, 100)); 		// -1
		System.out.println(sumOdd(100, 100)); 		// 0
		System.out.println(sumOdd(13, 13)); 		// 13
		System.out.println(sumOdd(100, -100)); 		// -1
		System.out.println(sumOdd(100, 1000)); 		// 247500
	}

	public static boolean isOdd(int number) {
		return number % 2 != 0 && number > 0 ? true : false;
	}

	public static int sumOdd(int start, int end) {
		int sum = 0;
		if (end >= start && end >= 0 && start >= 0) {
			for (int i = start; i <= end; i++) {
				if (isOdd(i)) {
					// mean is odd
					sum += i;
				}
			}
			return sum;
		} else {
			return -1;
		}
	}
}
