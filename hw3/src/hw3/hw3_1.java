package hw3;

import java.util.Scanner;

public class hw3_1 {
	
	//@SuppressWarnings("resource")
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int nums[];
		nums = new int[10];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(nums[5]);
	}
}
