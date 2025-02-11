
public class sumDigits {
	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252));		//4
		System.out.println(sumFirstAndLastDigit(257));		//9
		System.out.println(sumFirstAndLastDigit(0));		//0
		System.out.println(sumFirstAndLastDigit(5));		//10
		System.out.println(sumFirstAndLastDigit(-10));		//-1
	}

	public static int sumFirstAndLastDigit(int number) {
		int last = 0, first = 0;
		if(number >= 0) {
			last = number % 10;
			while(number >= 10) {
				number = number / 10;
			}
			first = number;
			return first + last;
		}else {
			return -1;
		}
	}
}
