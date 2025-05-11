package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int[] returnArr = readIntegers();
		System.out.println(Arrays.toString(returnArr));
		
		int returnedMin = findSmallest(returnArr);
		System.out.println("min : " + returnedMin);
	}
	
	private static int[] readIntegers() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Integers seperated by comma");
		String input = s.nextLine();
		
		String[] arr = input.split(",");
		int[] array = new int[arr.length];
		
		for(int i = 0; i<arr.length; i++) {
			array[i] = Integer.parseInt(arr[i].trim());
		}
		
		return array;
	}
	
	private static int findSmallest(int[] arr) {
		
		int smallest = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		
		return smallest;
	}
}
