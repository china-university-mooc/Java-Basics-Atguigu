public class WhileTest {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}

		int j = 0;
		do {
			if (j % 2 != 0) {
				System.out.println(j);
			}
			j++;
		} while(j < 10);
	}
}