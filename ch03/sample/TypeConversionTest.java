public class TypeConversionTest {

	public static void main(String[] args) {
		autoConversion();
		forceConversion();
	}

	public static void autoConversion() {
		System.out.println("====auto");

		double d = 3.5;
		// int i = d; 编译错误
		int i = 3;
		long l = i;
		float f = l;
		d = f;
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);

		byte b = 1;
		short s = 128;
		char c = 'a';
		// byte b1 = b + b; 编译错误
		// short s1 = s + s; 编译错误
		// char c1 = c + c; 编译错误

		int i1 = b + b;
		int i2 = s + s;
		int i3 = c + c;
		int i4 = b + c;
		int i5 = b + s;
		int i6 = c + s;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);

		boolean flag = true;
		// byte b1 = flag + b; 编译错误
	}

	public static void forceConversion() {
		System.out.println("====force");

		double d = 3.5;
		int i = (int)d;
		System.out.println(i);

		byte b = 1;
		byte b1 = (byte)(b + b);
		System.out.println(b1);
	}
}