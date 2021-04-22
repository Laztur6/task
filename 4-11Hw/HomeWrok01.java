package priv.szq.base.dy3Hw;

import java.util.Scanner;

public class HomeWrok01 {
	
	public static void main(String[] args) {
			CalculateMoney(3456);
			//CalculateSaving();
//			Machine machine = new Machine();
//			machine.punch();

		
		
	}

	static void CalculateSaving(){
//		5、艾边成同学到银行办理定期存款，他选择了1年定期，
//		每年到期后本息转存的方式，1年定期的利率为1.98%，
//		自定义方法CalculateSaving,通过输入的存款金额和存期
//		，计算到期后的本息总额。

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入存款金额");
		double	mon = scan.nextDouble();
		System.out.println("请输入存款年限");
		int year = scan.nextInt();
		double lilv = 0.0198;
		double	sum = mon*Math.pow((1+lilv), year);
		
		System.out.println(sum);
		
		
		
	}
	
	
	static void CalculateMoney(int mon) {
		
		// 第五套人民币的主币（不包括角、分）共有以下6种面值纸币：
		// 1元，5元，10元，20元，50元，100元。自定义方法CalculateMoney，
		// 计算要用这几种纸币组成金额“X”，最少需要多少纸币。

		int[] Money = { 1, 5, 10, 20, 50, 100 };
		int sum = 0;// 记录换钱次数
		int cont = 1;

		while (true) { // 死循环
			if (mon == 0) {// 判断输入的金额是否已为0，
				break;
			} // 判断输入的金额是否大于Money数组最大的值
				// 如果不大于cont+1，
			if (mon >= Money[Money.length - cont]) {

				mon -= Money[Money.length - cont];
				sum++;
			} else {
				// 判断cont是否大于数组长度
				if (cont < Money.length) {
					cont++;
					continue;
				}

			}

		}
		System.out.println(sum);
	}

}
