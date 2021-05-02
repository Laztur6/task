package priv.szq.base.day4_21Hw;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		addMoney();
	}

	private static void addMoney() {
		String a = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("请按下面格式输入");
		System.out.println("格式:充值卡卡号#充值卡密码#充值的手机号码");
		String str = scan.next();
		String[] split = str.split("#");
		System.out.println("请确认手机号码是否正确:"+split[2]);
		System.out.println("按1确认,按任意键退出");
		String next = scan.next();
		if (next.equals("1")) {

			System.out.println("充值成功"); 
		}else {
			System.out.println("充值失败,程序结束");
			System.exit(0);
		}
	}
}
