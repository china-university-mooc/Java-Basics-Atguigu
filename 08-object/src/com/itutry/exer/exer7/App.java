package com.itutry.exer.exer7;

import java.util.Scanner;
import java.util.Vector;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector scores = new Vector();
		
		int max = 0;
		while(true) {
			System.out.println("请输入学生成绩(负数代表输入结束)");
			int score = scan.nextInt();
			if (score < 0) {
				break;
			}
			if (score > 100) {
				System.out.println("输入的成绩超过100,请重新输入");
				continue;
			}
			scores.add(score);
			if (max < score) {
				max = score;
			}
		}
		
		for (int i = 0; i < scores.size(); i++) {
			char level;
			int score = (Integer)scores.elementAt(i);
			if (max - score < 10) {
				level = 'A';
			} else if (max - score < 20) {
				level = 'B';
			} else if (max - score < 30) {
				level = 'C';
			} else {
				level = 'D';
			}
			System.out.println("成绩为：" + score + ", 等级为： " + level);
		}
	}
}
