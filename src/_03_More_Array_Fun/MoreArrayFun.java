package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	static Random r = new Random();
	//1. Create a main method to test the other methods you write.
	public static void main(String args[]) {
		String[] strings = {"a", "b", "c", "d", "e"};
		//printStrings(strings);
		//printReverse(strings);
		//printOthers(strings);
		randomOrder(strings);
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printStrings(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void printReverse(String[] arr) {
		for (int i = arr.length; i > 0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void printOthers(String[] arr) {
		for (int i = 0; i < arr.length-1; i+=2) {
			System.out.println(arr[i]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void randomOrder(String[] arr) {
		ArrayList<String> array= new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			array.add(arr[i]); 
		}
		while(array.size() != 0) {
			int len = r.nextInt(array.size());
			System.out.println(array.get(len));
			array.remove(len);
		}
	
	}
	
}
