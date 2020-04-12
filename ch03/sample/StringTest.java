public class StringTest {

	public static void main(String[] args) {
		stringToPrimary();
		primaryToString();
	}

	public static void stringToPrimary() {
		System.out.println("====stringToPrimary");
		String s1 = "true";
		String s2 = "1";
		String s3 = "129";
		String s4 = "a";
		String s5 = "65535";
		String s6 = "678977";
		String s7 = "6.3";
		String s8 = "3.14";

		boolean flag = Boolean.parseBoolean(s1);
		byte b = Byte.parseByte(s2);
		short s = Short.parseShort(s3);
		char c = s4.charAt(0);
		int i = Integer.parseInt(s5);
		long l = Long.parseLong(s6);
		float f = Float.parseFloat(s7);
		double d = Double.parseDouble(s8);

		System.out.println(flag);
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
	}

	public static void primaryToString() {
		System.out.println("====primaryToString");

		boolean flag = true;
		byte b = 1;
		short s = 129;
		char c = 'a';
		int i = 65535;
		long l = 678977L;
		float f = 6.3f;
		double d = 3.14;

		String s1 = flag + "";
		String s2 = b + "";
		String s3 = s + "";
		String s4 = c + "";
		String s5 = i + "";
		String s6 = l + "";
		String s7 = f + "";
		String s8 = d + "";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);

		s1 = String.valueOf(flag);
		s2 = String.valueOf(b);
		s3 = String.valueOf(s);
		s4 = String.valueOf(c);
		s5 = String.valueOf(i);
		s6 = String.valueOf(l);
		s7 = String.valueOf(f);
		s8 = String.valueOf(d);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
	}
}