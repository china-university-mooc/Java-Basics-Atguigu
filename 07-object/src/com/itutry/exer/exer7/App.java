package com.itutry.exer.exer7;

import java.util.Arrays;

/**
 * 定义一个int型的数组:int[] arr = new int[]{12,3,3,34,56,77,432}; 
 * 让数组的每个位置上的值去除以首位置的元素，得到的结果，作为该位置上的 新值。遍历新的数组。
 * 
 * @author itutry
 * @date Jun 6, 202010:02:44 AM
 */
public class App {

	public static void main(String[] args) {
		int[] arr = new int[]{12,3,3,34,56,77,432};
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] /= arr[0];
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr);
		char[] arr1 = new char[]{'a', 'b', 'c'};
		System.out.println(arr1);
	}
}
