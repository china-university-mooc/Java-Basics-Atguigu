import java.util.Scanner;

public class SwitchExer2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		switch (score / 60) {
			case 1:
				System.out.println("合格");
				break;
			case 0:
				System.out.println("不合格");
				break;
		}
	}
}