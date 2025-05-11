package dev.lpa;

import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int[] newarr = arr;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newarr));
		System.out.println("-".repeat(15));
		
		newarr[0] = 1;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newarr));
	
	}
}
