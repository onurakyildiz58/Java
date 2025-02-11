
public class leap {
	public static void main(String[] args) {
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
	}
	public static boolean isLeapYear(int year){
        if(year <= 1 || year >= 9999)
            return false;
        return year % 4 == 0;
    }
}
