package com.itutry.exer;

/**
 * 二分查找
 * 
 * @author itutry
 * @date May 18, 202010:08:42 PM
 */
public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = new int[]{-99,-54,-2,0,2,33,43,256,999};
		int index = binarySearch(arr, 257);
		if (index >= 0) {
			System.out.println("找到指定的元素，索引为：" + index);
		} else {
			System.out.println("未找到指定元素");
		}
	}

	public static int binarySearch(int[] arr, int x) {
		int left = 0;
		int right = arr.length;
		int index = -1;
		while(left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == x) {
				index = mid;
				break;
			} else if (arr[mid] > x) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		
		return index;
	}
}
