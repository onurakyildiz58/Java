package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int[] myArr = new int[10];
		myArr[0] = 0;
		myArr[1] = 11;
		myArr[2] = 22;
		myArr[3] = 33;
		myArr[4] = 44;
		myArr[5] = 55;
		myArr[6] = 66;
		myArr[7] = 77;
		myArr[8] = 88;
		myArr[9] = 99;
		for(int i=0; i<myArr.length; i++) {
			System.out.println(myArr[i]);	
		}
		
		System.out.println("-".repeat(10));
		double[] dArr = new double[] {1.0, 2.0, 3.0};
		for(int i=0; i<dArr.length; i++) {
			System.out.println(dArr[i]);	
		}
		
		
		System.out.println("-".repeat(10));
		String[] sArr = new String[5];
		for(int i=0; i<sArr.length; i++) {
			sArr[i] = (i + 1) + ". item";	
		}
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);	
		}
		
		System.out.println("-".repeat(10));
		int[] intArr = {1, 2 , 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i=0; i<intArr.length; i++) {
			System.out.printf("%d. item is %d%n", i+1, intArr[i]);	
		}
		
		System.out.println("-".repeat(10));
		int[] randArr;
		randArr = new int[]{1, 1, 1, 1};
		for(int i=0; i<randArr.length; i++) {
			System.out.print(randArr[i] + " ");	
		}
		System.out.println();
		for(int element : randArr) {
			System.out.print(element + " ");
		}
		
		System.out.println(); 
		System.out.println("-".repeat(10));
		String[] libArr = new String[] {"a", "b", "c", "d"};
		System.out.println(Arrays.toString(libArr));
	
		System.out.println("-".repeat(10));
		Object[] objArr = new Object[3];
		objArr[0] = "Hello";
		objArr[1] = new StringBuilder("World");
		objArr[2] = libArr;
		System.out.println(Arrays.deepToString(objArr));
		
		System.out.println("-".repeat(10));
		int[] arrrrrr = getRandomArr(10);
		System.out.println(Arrays.toString(arrrrrr));
		Arrays.sort(arrrrrr);
		System.out.println(Arrays.toString(arrrrrr));
		
		System.out.println("-".repeat(10));
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr));
		
		System.out.println("-".repeat(10));
		int[] copyArr = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(copyArr));
		
		System.out.println("-".repeat(10));
		int[] smallerArr = Arrays.copyOf(arr, 5);
		System.out.println(Arrays.toString(smallerArr));
		
		System.out.println("-".repeat(10));
		int[] biggerArr = Arrays.copyOf(arr, 15);
		System.out.println(Arrays.toString(biggerArr));
		
		System.out.println("-".repeat(10));
		int[] searchArr = getRandomArr(1000);
		System.out.println(Arrays.toString(searchArr));
		if(Arrays.binarySearch(searchArr, 31)>=0) {
			System.out.println("vardır demiş kapatmış");
		}else {
			System.out.println("yoktur demii kapatmış");
		}
		
		System.out.println("-".repeat(10));
		int[] s1 = {1, 2, 3};
		int[] s2 = {1, 2, 3};
		if(Arrays.equals(s1, s2)) { //length, order and values shpuld be equal
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
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
	