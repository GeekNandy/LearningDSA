package com.arrays.sorting;

public class LinearSearch {

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int target = 20;
        System.out.println(linearSearch(arr, target));
    }
}
