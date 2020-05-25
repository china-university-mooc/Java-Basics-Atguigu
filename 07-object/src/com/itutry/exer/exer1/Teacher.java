package com.itutry.exer.exer1;

public class Teacher {

	String name;
	int age;
	int teachAge;
	String course;
	
	public String say() {
		return "我是老师，我的名字叫" + name + "，我的年龄是" + age + "岁，我的教龄是" + teachAge + "年，我教的课程是" + course + "。";
	}
}
