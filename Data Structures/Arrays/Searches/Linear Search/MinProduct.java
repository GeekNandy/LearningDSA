package com.arrays.sorting;

public class MinProduct {
	
	static int calcMinProduct(int[] arr) {
		
		int len = arr.length;
		if(len < 2) return Integer.MAX_VALUE;
		else {
			int m = Integer.MAX_VALUE;
			int sm = Integer.MAX_VALUE;
			int h = Integer.MIN_VALUE;
			int sh = Integer.MIN_VALUE;
			
			for(int i = 0; i < len; i++) {
				// calc highest & second highest
				if(arr[i] > h) {
					sh = h;
					h = arr[i];
				}
				else if(arr[i] > sh) {
					sh = arr[i];
				}
				
				// calc lowest & second lowest
				if(arr[i] < m) {
					sm = m;
					m = arr[i];
				}
				else if(arr[i] < sm) {
					sm = arr[i];
				}
			}
			
			int prod = m * h; // 11
			if(prod > h * sh) { // 99
				prod = h * sh;
			}
			else if(prod > m * sm) { // 2
				prod = m * sm;
			}
			
			return prod;
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {2,4,6,8,9,1,5,11};
		System.out.println(calcMinProduct(arr));
	}

}
