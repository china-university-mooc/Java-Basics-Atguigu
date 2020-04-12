public class BitOperatorExercise {

	public static void main(String[] args) {
		int num = 60;

		int i = num & 15;
		char i2 = (i > 9) ? (char)(i - 10 + 'A') : (char)(i + '0');
		num >>= 4;
		int j = num & 15;
		char j2 = (j > 9) ? (char)(j - 10 + 'A') : (char)(j + '0');

		System.out.println(i2 + "" + j2);
	}
}