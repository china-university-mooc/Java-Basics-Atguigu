/**
 * 输出九九乘法表
 * 1x1=1
 * 2x1=1 2*2=4
 * ...
 * 9x1=9 9x2=18 9x9=81
 */
public class LoopExer1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "x" + j + "=" + i*j + " ");
			}
			System.out.println();
		}
	}
}