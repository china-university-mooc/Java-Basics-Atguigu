/**
 * 100以内的质数
 */
public class LoopExer2 {

	public final static int N = 100000;

	public static void main(String[] args) {
		// 带打印：18948ms 1439ms 95ms
		// 无打印：19568ms 1881ms 32ms 
		long start = System.currentTimeMillis();
		method3();
		long end = System.currentTimeMillis();
		System.out.println("cost: " + (end - start) + "ms");
	}

	public static void method1() {
		int count = 0;
		for (int i = 2; i <= N; i ++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
				}
			}
			if (prime) {
				// System.out.println(i);
				count++;
			}
		}
		System.out.println("质数的个数为：" + count);
	}

	public static void method2() {
		int count = 0;
		for (int i = 2; i <= N; i ++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				// System.out.println(i);
				count++;
			}
		}
		System.out.println("质数的个数为：" + count);
	}

	public static void method3() {
		int count = 0;
		for (int i = 2; i <= N; i ++) {
			boolean prime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				// System.out.println(i);
				count++;
			}
		}
		System.out.println("质数的个数为：" + count);	
	}
}