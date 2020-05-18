package com.itutry.exer;

/**
 * 定义一个int型的一维数组，包含10个元素，分别赋一些两位随机整数， 
 * 然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
 * 
 * @author itutry
 * @date May 18, 20209:58:01 PM
 */
public class ArrayExer3 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 90 + 10);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
			sum += arr[i];
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("sum: " + sum);
		System.out.println("agv: " + sum / arr.length);
	}
}
