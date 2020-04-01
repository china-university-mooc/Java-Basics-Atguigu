public class RadixTest {

	public static void main(String[] args) {
		int i1 = 0b11;
		int i2 = 0B11;
		int i3 = 077;
		int i4 = 0xf1;
		int i5 = 0XF1;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);

		int i6 = -1;
		System.out.println(Integer.toBinaryString(i6));
		System.out.println(Integer.toOctalString(i6));
		System.out.println(Integer.toHexString(i6));
		System.out.println(Integer.toString(i6, 8));
	}
}