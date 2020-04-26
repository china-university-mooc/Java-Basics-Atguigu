package com.itutry.demo;

import java.util.Scanner;

/**
 * 从键盘读入学生成绩，找出最高分， 并输出学生成绩等级
 * 
 * @author itutry
 * @date 2020年4月26日下午10:33:03
 */
public class ArrayDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生人数：");
		int count = scan.nextInt();
		
		System.out.println("请输入" + count + "个成绩：");
		int[] scores = new int[count];		
		int maxScore = 0;
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scan.nextInt();
			if (scores[i] > maxScore) {
				maxScore = scores[i];
			}
		}
		scan.close();
		System.out.println("最高分是：" + maxScore);
		
		for (int i = 0; i < scores.length; i++) {
			int diff = maxScore - scores[i];
			char level;
			if (diff <= 10) {
				level = 'A';
			} else if (diff <= 20) {
				level = 'B';
			} else if (diff <= 30) {
				level = 'C';
			} else {
				level = 'D';
			}
			System.out.println("student " + i + " score is " + scores[i] + " grade is " + level);
		}
	}
}
