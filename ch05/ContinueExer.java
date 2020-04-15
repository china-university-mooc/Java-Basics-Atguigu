public class ContinueExer {

	public static void main(String[] args) {
		label:for (int i = 2; i <= 100; i ++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue label;		
				}
			}
			System.out.println(i);
		}
	}
}