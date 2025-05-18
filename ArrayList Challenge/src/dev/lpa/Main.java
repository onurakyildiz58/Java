package dev.lpa;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean flag = true;
		ArrayList<String> Array = new ArrayList<>(); 
		
		while (flag) {
			printActions();
			
			switch(Integer.parseInt(scanner.nextLine())) {
			case 0 :
				flag = false;
				break;
			case 1 : 
				System.out.println("Adding option");
				addItems(Array);
				break;
			case 2 : 
				System.out.println("Removing action");
				removeItems(Array);
				break;
			default : 
				System.out.println("unauthorized action");
				flag = false;
				break;
			}
			Array.sort(Comparator.naturalOrder());
			System.out.println(Array);
		}
	}
	
	private static void addItems(ArrayList<String> Array) {
		System.out.println("add item(s) [seperated by comma]");
		String[] items = scanner.nextLine().split(",");
		Array.addAll(List.of(items));
	}
	
	private static void removeItems(ArrayList<String> Array) {
		System.out.println("add item(s) [seperated by comma]");
		String[] items = scanner.nextLine().split(",");
		Array.removeAll(List.of(items));
	}
	
	private static void printActions() {
		String textBlok = """
				Available Actions:
				
				0 - to Shutdown
				
				1 - to add item(s) to list (comma delimited list)
					
				3 - to remove ant items (comma delimited)
				
				enter a number for which action you wanna do :""";
		System.out.print(textBlok + " ");
	}
}
