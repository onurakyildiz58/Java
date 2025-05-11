package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		int[] arr = getRandomArr(20);
		System.out.println("base array : "+ Arrays.toString(arr));
		Arrays.sort(arr);
		
		int [] reverseArr = new int[arr.length];
		
		System.out.println("ASC Sorted : "  + Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			reverseArr[reverseArr.length - 1 - i] = arr[i];
		}
		
		System.out.println("DESC Sorted : " + Arrays.toString(reverseArr));
		
	}
	private static int[] getRandomArr(int len) {
		Random rnd = new Random();
		int[] rndArr = new int[len];
		
		for(int i=0; i<len; i++) {
			rndArr[i] = rnd.nextInt(50);
		}
		return rndArr;
	}
}
