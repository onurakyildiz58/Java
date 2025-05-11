package dev.lpa;

public class Main {
	public static void main(String... args) {
		System.out.println("Hello World Again");
		
		String[] splitText = "Hello World Again".split(" ");
		printText(splitText);
	}
	
	public static void printText(String... text) {
		for(String t : text) {
			System.err.println(t);
		}
	}
}
