package com.itutry.exer;

/**
 * 获取arr数组中所有元素的和
 * 
 * @author itutry
 * @date May 18, 20209:24:25 PM
 */
public class ArrayExer2 {

	public static void main(String[] args) {
		int[][] arr = new int[][] {{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("sum: " + sum);
	}
}
