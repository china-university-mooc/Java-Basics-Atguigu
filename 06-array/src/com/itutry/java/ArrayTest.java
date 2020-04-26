package com.itutry.java;

/**
 * 一维数组的使用
 * 
 * @author itutry
 * @date 2020年4月26日下午10:27:25
 */
public class ArrayTest {

	public static void main(String[] args) {
		// 静态初始化
//		int ids[] = new int[] {1,3,9};
//		int[] ids = {1,3,9};
		int[] ids = new int[] {1,3,9};
		for (int i = 0; i < ids.length; i++) {
			System.out.print(ids[i] + " ");
		}
		System.out.println();
		
		// 动态初始化
		String[] names = new String[3];
		names[0] = "张三";
		names[1] = "李四";
		names[2] = "王五";
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		
		// 默认值
		int[] arr1 = new int[1];
		System.out.println("int[] 默认：" + arr1[0]);
		double[] arr2 = new double[1];
		System.out.println("double[] 默认：" + arr2[0]);
		char[] arr3 = new char[1];
		System.out.println("char[] 默认：" + arr3[0]);
		boolean[] arr4 = new boolean[1];
		System.out.println("boolean[] 默认：" + arr4[0]);
		String[] arr5 = new String[1];
		System.out.println("String[] 默认：" + arr5[0]);
	}
}
