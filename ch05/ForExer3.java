/**
 * 输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数 字立方和等于其本身。
 */
public class ForExer3 {

	public static void main(String[] args) {
		for(int i = 100; i < 1000; i++) {
			int x = i / 100;
			int y = i % 100 / 10;
			int z = i % 10;
			if (x*x*x + y*y*y + z*z*z == i) {
				System.out.println(i);
			} 
		}
	}
}