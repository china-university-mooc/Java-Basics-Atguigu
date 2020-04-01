public class RadixConversion {

	public static void main(String[] args) {
		System.out.println(decimalToRadix("100", 2));
		System.out.println(radixToDecimal("1100100", 2));

		System.out.println(decimalToRadix("100", 8));
		System.out.println(radixToDecimal("144", 8));

		System.out.println(decimalToRadix("255", 16));
		System.out.println(radixToDecimal("FF", 16));

		System.out.println(radixToOther("0xFF", 2));
		System.out.println(radixToOther("16", 17));

		System.out.println("=====十进制 -> 十六进制");
		System.out.println(radixToOther("123", 16));
		System.out.println(radixToOther("256", 16));
		System.out.println(radixToOther("87", 16));
		System.out.println(radixToOther("12", 16));

		System.out.println("=====十进制 -> 二进制");
		System.out.println(radixToOther("123", 2));
		System.out.println(radixToOther("256", 2));
		System.out.println(radixToOther("87", 2));
		System.out.println(radixToOther("12", 2));

		System.out.println("=====十六进制 -> 十进制");
		System.out.println(radixToOther("0x123", 10));
		System.out.println(radixToOther("0x25F", 10));
		System.out.println(radixToOther("0x38", 10));
		System.out.println(radixToOther("0x62", 10));

		System.out.println("=====十六进制 -> 二进制");
		System.out.println(radixToOther("0x123", 2));
		System.out.println(radixToOther("0x25F", 2));
		System.out.println(radixToOther("0x38", 2));
		System.out.println(radixToOther("0x62", 2));
	}

	public static String radixToOther(String src, int toRadix) {
		int fromRadix = 10;
		if (src.charAt(0) == '0') {
			char c = src.charAt(1);
			if (c == 'x' || c == 'X') {
				fromRadix = 16;
				src = src.substring(2);
			} else if (c == 'b' || c == 'B') {
				fromRadix = 2;
				src = src.substring(2);
			} else {
				fromRadix = 8;
				src = src.substring(1);
			}
		}

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