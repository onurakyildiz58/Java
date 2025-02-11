
public class hasTeen {
	public static void main(String[] args) {
		System.out.println(hasTeen(9, 99, 19));
		System.out.println(hasTeen(23, 15, 42));
		System.out.println(hasTeen(22, 23, 34));

		System.out.println(isTeen(9));
		System.out.println(isTeen(13));

	}

	public static boolean hasTeen(int num1, int num2, int num3) {
		return (13 <= num1 && num1 <= 19) || (13 <= num2 && num2 <= 19) || (13 <= num3 && num3 <= 19);
	}

	public static boolean isTeen(int num) {
		return (13 <= num && num <= 19);
	}
}
