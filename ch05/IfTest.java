import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		if (i >= 0)
			if (i == 0) 
				System.out.println("first");
		else 
			System.out.println("second");

		System.out.println("third");
	}
}