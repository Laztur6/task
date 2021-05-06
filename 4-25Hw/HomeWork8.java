package priv.szq.base.homework;

public class HomeWork8 {
	// 如果调用f(2)，请问输出结果是多少？
	public static void main(String[] args) {
		System.out.println(f(2));
		System.out.println("finally把以前返回的覆盖了");
	}
	public static int f(int n) {
		try {
			int r = n * n;
			return r;
		} finally {
			if (n == 2)
				return 0;
		}
	}
	

}
