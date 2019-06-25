package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
			String[] s = new String[]{"a","b","c","d","e"};
		//2. print the third element in the array
			System.out.println(s[2]);
		//3. set the third element to a different value
			s[2] = "f";
		//4. print the third element again
			System.out.println(s[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
			for(int i = 0; i < s.length; i++) {
				s[i] = "g";
			}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
			for(int i = 0; i < s.length; i++) {
				System.out.println(s[i]);
			}
		//7. make an array of 50 integers
			int[] nums = new int[50];
		//8. use a for loop to make every value of the integer array a random number
			Random r = new Random();
			for(int i = 0; i < nums.length; i++) {
				nums[i] = (int) r.nextInt();
			}
		//9. without printing the entire array, print only the smallest number on the array
			int min = nums[0];
			for(int i = 1; i < nums.length; i++) {
				if(nums[i] < min) min = nums[i];
			}
			System.out.println("min: " + min);
		//10 print the entire array to see if step 8 was correct
			for(int i = 0; i < nums.length; i++) {
				System.out.println(nums[i]);
			}
		//11. print the largest number in the array.
			int max = nums[0];
			for(int i = 1; i < nums.length; i++) {
				if(nums[i] > max) max = nums[i];
			}
			System.out.println("max: " + max);
		//12. print only the last element in the array
			System.out.println("last: " +nums[nums.length-1]);
	}
}
