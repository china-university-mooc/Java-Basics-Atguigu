import java.util.Scanner;
/**
 * 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入 为0时结束程序。
 */
public class WhileExer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int positiveCount = 0;
		int negativeCount = 0;
		System.out.println("请输入一串数字，逗号分隔，0表示结束：");
		while(true) {
			int num = scan.nextInt();
			if (num > 0) {
				positiveCount++;
			} else if (num < 0) {
				negativeCount++;
			} else {
				break;
			}
		}
		System.out.println("正数个数为：" + positiveCount + ",负数个数为：" + negativeCount);
	}
}