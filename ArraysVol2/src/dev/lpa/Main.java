package dev.lpa;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		
		String[] arr1 = {"c", "b", "a"};
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		
		ArrayList<String> arr2 = new ArrayList<>(List.of("c", "b", "a"));
		System.out.println(arr2);
		arr2.sort(Comparator.naturalOrder());
		System.out.println(arr2);
		arr2.sort(Comparator.reverseOrder());
		System.out.println(arr2);
		
		String[] originalArr = new String[] {"a", "b", "c", "d", "e", "f"};
		var originalList = Arrays.asList(originalArr);
		originalList.set(0,"one");

		System.out.println(originalList);
		System.out.println(Arrays.toString(originalArr));
	}
}
