import java.util.Scanner;

public class SwitchExer1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		switch (c) {
			case 'a':
				System.out.println("A");
				break;
			case 'b':
				System.out.println("B");
				break;
			case 'c':
				System.out.println("C");
				break;
			case 'd':
				System.out.println("D");
				break;
			case 'e':
				System.out.println("E");
				break;
			default:
				System.out.println("other");
		}
	}
}