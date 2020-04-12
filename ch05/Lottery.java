import java.util.Scanner;
import java.util.Random;


public class Lottery {

	public static void main(String[] args) {
		// int num = (int)(Math.random() * 90 + 10);
		Random random = new Random();
		int num = random.nextInt(90) + 10;
		System.out.println(num);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输出彩票数字");
		int ticket = scan.nextInt();

		if (num == ticket) {
			System.out.println("奖金10000美元");
		} else if (num / 10 == ticket % 10 && num % 10 == ticket / 10) {
			System.out.println("奖金3000美元");
		} else if (num / 10 == ticket / 10 || num % 10 == ticket % 10) {
			System.out.println("奖金1000美元");
		} else if (num / 10 == ticket % 10 || num % 10 == ticket / 10) {
			System.out.println("奖金500美元");
		} else {
			System.out.println("彩票作废");
		}
	}
} 