import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// switch后不能是布尔
		// boolean b = true;
		// switch (b) {
		// 	case true:
		// 		System.out.println("true");
		// }

		// switch后不能是浮点
		// double d = 1;
		// switch (d) {
		// 	case 1.0:
		// 		System.out.println("true");
		// }

		// case或需要常量表达式
		// int i = 1;
		// int j = 1;
		// switch (i) {
		// 	case j:
		// 		System.out.println("true");
		// }

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		switch (i) {
			default:
				System.out.println("other");
				break;
			case -1:
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("one");
				break;
		}
	}
}