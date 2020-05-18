package com.itutry.exer;

/**
 * 冒泡排序
 * 
 * @author itutry
 * @date May 18, 202010:21:01 PM
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] {29, 23, 40, 95, 91, 96, 68, 18, 91, 35};
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
