public class PrimaryTypeTest {

	public static void main(String[] args) {
		integerTest();
		floatTest();
		charTest();
	}

	public static void integerTest() {
		System.out.println("=====integerTest");
		byte b1 = -128;
		byte b2 = 127;
		//byte b3 = 128; 编译错误
		System.out.println(b1);
		System.out.println(b2);

		long l1 = 12;
		long l2 = 12222222222222222L;
		// long l2 = 12222222222222222; 编译错误
		System.out.println(l1);
		System.out.println(l2);
	}

	public static void floatTest() {
		System.out.println("=====floatTest");
		double d1 = 5.12;
		double d2 = 5.12e1;
		double d3 = 5.12E2;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

		// float f1 = 51.2; 编译错误
		float f2 = 3.14f;
		float f3 = 3.14e1f;
		System.out.println(f2);
		System.out.println(f3);
	}

	public static void charTest() {
		System.out.println("=====charTest");
		char c1 = '中';
		char c2 = '\n';
		char c3 = '\u12ab';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		char c4 = 'A';
		System.out.println(c4 + 1);
	}
}