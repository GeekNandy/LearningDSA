package com.arrays.sorting;

import java.util.*;

public class EquilibriumIndex {
	
	// equilibrium index of array
	// {1, 2, 3, 4, 6} -> eq indx = 3
	// {2, 5, 8, -3, 0, 4, 3, 5} -> eq indx = 4
	// an index where all LHS elements sum = RHS elements sum
	
	public static int calcEqlbIndx(int[] arr) {
		int sum = 0;
		for(int i : arr) sum += i; // total sum
		for(int i = 0, left = 0; i < arr.length; i++) {
			sum -= arr[i]; // RHS sum (total sum - current elem)
			if(left == sum) return i;
			left += arr[i];
		}
		return -1;
	}
	
	public static void main(String...strings ) {
		Scanner scan = new Scanner(System.in);
		//int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
		// int[] arr = {1, 2, 3, 4, 6};
		int[] arr = {2, 5, 8, -3, 0, 4, 3, 5};
		System.out.println(calcEqlbIndx(arr));
		scan.close();
	}

}
