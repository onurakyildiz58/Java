
public class Main {
	public static void main(String[] args) {
		String str = "List:\n" + 
					"\t\u2022 first\n" +
					"\t\u2022 second";
		
		System.out.println(str);
		
		String strBlock = """
				text block:
					\u2022 first
					\u2022 second
				""";
		
		System.out.println(strBlock);
		
		int age = 24;
		System.out.printf("age is %d%n", age);
		
		int birthYear = 2025 - age;
		System.out.printf("age is %d birth year is %d%n", age, birthYear); //%f for double or float %d for int %n is for new line
		
		float x = (float) 12.123442123;
		System.out.printf("%.3f%n", x); // %.3f mean is print 3 digits after .
	
		for(int i = 1; i <= 100000; i = i* 10) {
			System.out.printf("number is %6d %n", i);
		}
		
		String formattedStr = String.format("your age is %d", age);
		System.out.println(formattedStr);
		
		formattedStr = "your age is %d".formatted(age);
		System.out.println(formattedStr);
	}
}
