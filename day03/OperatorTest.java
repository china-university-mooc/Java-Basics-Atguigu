public class OperatorTest {

	public static void main(String[] args) {
		System.out.println("5 % 2 = " + (5 % 2));
		System.out.println("-5 % 2 = " + (-5 % 2));
		System.out.println("5 % -2 = " + (5 % -2));
		System.out.println("-5 % -2 = " + (-5 % -2));

		byte b = 127;
		b++;
		System.out.println(b);

		int i,j;
		i = j = 10;
		System.out.println(i);
		System.out.println(j);

		int m = 20, n = 30;
		i = j = 10;
		System.out.println(m);
		System.out.println(n);

		int x = 2;
		int y = 2;
		if (x == 2 && y++ == 3);
		System.out.println(x);
		System.out.println(y);
		if (x == 3 && y++ == 3);
		System.out.println(x);
		System.out.println(y);

		int i1 = -2;
		int i2 = i1 << 2;
		int i3 = i2 >> 2;
		int i4 = i2 >>> 2;
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);

		int i5 = 9;
		System.out.println(i5 << 27);
		System.out.println(i5 << 28);
	}
}
