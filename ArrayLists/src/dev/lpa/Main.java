package dev.lpa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

record GroceryItems(String name, String type, int count) {
	public GroceryItems(String name) {
		this(name, "DAIRY", 3);
	}
	
	@Override
	public String toString() {
		return String.format("%d %s in %s", count, name.toUpperCase(Locale.ENGLISH), type);
	}
}

public class Main {
	public static void main(String[] args) {
		Object[] obj1 = new Object[3];
		obj1[0] = new GroceryItems("Apples", "fruits", 2);
		obj1[1] = new GroceryItems("Milk");
		obj1[2] = "31 banana";
		System.out.println(Arrays.toString(obj1));
		
		//only get records type suitable because of we defined GroceryItems as a array
		GroceryItems[] obj2 = new GroceryItems[3];
		obj2[0] = new GroceryItems("Apples", "fruits", 2);
		obj2[1] = new GroceryItems("Milk");
		obj2[2] = new GroceryItems("cherry", "fruits", 2);
		System.out.println(Arrays.toString(obj2));
		
		ArrayList arrList1 = new ArrayList();
		arrList1.add(new GroceryItems("Viskey"));
		arrList1.add("coke");
		System.out.println(arrList1);
		// as like before if we defined array type we gotta define our array items suitable for records or array type
		ArrayList<GroceryItems> arrList2 = new ArrayList<>();
		arrList2.add(new GroceryItems("Viskey"));
		arrList2.add(new GroceryItems("coke"));
		arrList2.add(0, new GroceryItems("bebzi")); //defines 0 as first item in array to simulate stack in data structures otherwise it would be like queue
		arrList2.set(1 ,new GroceryItems("ayran"));
		arrList2.remove(2);
		System.out.println(arrList2);
		
		System.out.println("-".repeat(50));
		
		String[] items = {"onur", "onur", "utku", "deniz", "ebru"};
		List<String> list = List.of(items);
		//list.add("deneme"); -> immutable list cant add any value to it 
		System.out.println(list);
		System.out.println(list.getClass().getName());
		
		ArrayList<String> alist = new ArrayList<>(list);// if adding to list necessary array list ain't immutable
		alist.add("fero");
		System.out.println(alist);
		
		
		ArrayList<String> blist = new ArrayList<>(List.of("a", "b", "c"));
		alist.addAll(blist);
		System.err.println(alist);
		
		System.out.println(alist.get(2));
		System.out.println(alist.contains("onur"));
		System.out.println(alist.indexOf("onur"));
		System.out.println(alist.lastIndexOf("onur"));
		
		System.out.println(alist);
		alist.remove(2);
		System.out.println(alist);
		alist.remove("onur");
		System.out.println(alist);
		
		alist.removeAll(List.of("ebru", "fero"));//removes this items
		System.out.println(alist);
		

		alist.retainAll(List.of("a", "c"));//keeps this items
		System.out.println(alist);
		
		alist.sort(Comparator.reverseOrder());
		System.out.println(alist);
		alist.sort(Comparator.naturalOrder());
		System.out.println(alist);
	}
}
