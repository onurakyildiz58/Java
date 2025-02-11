public class decimalComparator {

	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
		System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
	}
	public static boolean areEqualByThreeDecimalPlaces(double firstParameter, double secondParameter){
		int firstTruncated = (int) (firstParameter * 1000);
        int secondTruncated = (int) (secondParameter * 1000);
               
        return (firstTruncated == secondTruncated);
	}
}
