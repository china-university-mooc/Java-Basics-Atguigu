public class ForTest {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0, j = 0; i < 100; i++,j++) {
			sum += i;
			System.out.println(j);
		}
		System.out.println("sum=" + sum);
	}
}