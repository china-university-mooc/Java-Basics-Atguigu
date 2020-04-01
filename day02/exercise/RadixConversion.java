public class RadixConversion {

	public static void main(String[] args) {
		System.out.println(decimalToRadix("100", 2));
		System.out.println(radixToDecimal("1100100", 2));

		System.out.println(decimalToRadix("100", 8));
		System.out.println(radixToDecimal("144", 8));

		System.out.println(decimalToRadix("255", 16));
		System.out.println(radixToDecimal("FF", 16));

		System.out.println(radixToOther("FF", 16, 2));
		System.out.println(radixToOther("16", 10, 17));
	}

	public static String radixToOther(String src, int fromRadix, int toRadix) {
		return decimalToRadix(radixToDecimal(src, fromRadix), toRadix);
	}

	public static String decimalToRadix(String src, int radix) {
		int value = Integer.parseInt(src);
		StringBuilder dest = new StringBuilder();
		while (value > 0) {
			int remainder = value % radix;
			if (remainder < 10) {
				dest.insert(0, remainder);
			} else {
				char c = (char)('A' + remainder - 10);
				dest.insert(0, c);
			}
			value = value / radix;
		}
		return dest.toString();
	}

	public static String radixToDecimal(String src, int radix) {
		int dest = 0;
		for (char c : src.toCharArray()) {
			int value = c - '0';
			if (c >= 'a') {
				value = 10 + c - 'a';
			} else if (c >= 'A') {
				value = 10 + c - 'A';
			}
			if (value >= radix) {
				throw new RuntimeException("数字超出进制限制");
			}
			dest = dest * radix + value;
		}
		return String.valueOf(dest);
	}
}