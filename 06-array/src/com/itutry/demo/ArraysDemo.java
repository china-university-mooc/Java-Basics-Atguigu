package com.itutry.demo;

import java.util.Arrays;

/**
 * Arrays类使用
 * - equals()
 * - toString()
 * - fill()
 * - sort()
 * - binarySearch()
 * 
 * @author itutry
 * @date May 18, 202010:33:12 PM
 */
public class ArraysDemo {

	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 2, 3, 4};
		int[] arr2 = new int[] {1, 2, 3, 4};
		int[] arr3 = new int[] {1, 3, 2, 4};
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr1, arr3));
		
		int[] arr4 = new int[10];
		Arrays.fill(arr4, 5);
		System.out.println(Arrays.toString(arr4));
		
		int[] arr5 = new int[] {29, 23, 40, 95, 91, 96, 68, 18, 91, 35};
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5));
		

		System.out.println(Arrays.binarySearch(arr5, 40));
		System.out.println(Arrays.binarySearch(arr5, 42));
	}
}
