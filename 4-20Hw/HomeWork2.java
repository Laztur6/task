package priv.szq.base.day4_21Hw;

import java.util.Arrays;

public class HomeWork2 {
	public static void main(String[] args) {
		HomeWork2 hw2 = new HomeWork2();
		hw2.getYuMing("http://www.baidu.com:80/");

	}
	private void getYuMing(String str) {
		String[] str2 = str.split("//|:");
		System.out.println(Arrays.toString(str2));
		System.out.println(str2[0]);
		System.out.println(str2[2]);
	}
}
