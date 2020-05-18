package com.itutry.exer;

/**
 * 使用二维数组打印一个 10 行杨辉三角
 * 
 * @author itutry
 * @date May 18, 20209:56:50 PM
 */
public class YangHuiTriangle {

	public static void main(String[] args) {
		int n = 10;
		int[][] yangHui = new int[10][];
		
		for (int i =0; i < yangHui.length; i++) {
			int len = i + 1;
			yangHui[i] = new int[len];
			yangHui[i][0] = 1;
			yangHui[i][len - 1] = 1;
			
			for (int j = 1; j < len -1; j++) {
				yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
			}
		}
		
		for (int i = 0; i < yangHui.length; i++) {
			for (int j = 0; j < yangHui[i].length; j++) {
				System.out.print(yangHui[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
