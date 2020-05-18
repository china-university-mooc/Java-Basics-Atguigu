package com.itutry.java;

/**
 * 二维数组的使用
 * 
 * @author itutry
 * @date 2020年4月26日下午10:53:22
 */
public class TwoDimArrayDemo {

	public static void main(String[] args) {
		// 静态初始化
//		int[] arr[] = new int[][] {{1}, {2,3}, {4,5,6}};
//		int arr[][] = new int[][] {{1}, {2,3}, {4,5,6}};
//		int[][] arr = {{1}, {2,3}, {4,5,6}};
		int[][] arr = new int[][] {{1}, {2,3}, {4,5,6}};
		System.out.println("arr:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// 动态初始化1
		int[][] arr1 = new int[3][];
		System.out.println("arr1:");
		System.out.print("外层元素默认值：");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		arr1[0] = new int[] {1,2,3};
		arr1[1] = new int[] {4,5};
		arr1[2] = new int[] {6};
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		// 静态初始化
		int[][] arr2 = new int[2][2];
		System.out.println("arr2:");
		System.out.print("外层元素默认值：");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[1][0] = 3;
		arr2[1][1] = 4;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
