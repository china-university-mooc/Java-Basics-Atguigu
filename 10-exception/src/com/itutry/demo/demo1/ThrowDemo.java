package com.itutry.demo.demo1;

public class ThrowDemo {
	
	public static void main(String[] args) {
		try {
			Student student = new Student();
			student.register(-1);
			System.out.println(student);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class Student {
	private int id;
	
	public void register(int id) throws Exception {
		if (id > 0) {
			this.id = id;
		} else {
//			System.out.println("输入的数据非法");
//			throw new RuntimeException("输入的数据非法");
//			throw new Exception("输入的数据非法");
			throw new MyException("不能输入负数");
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
}
