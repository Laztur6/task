package priv.szq.base.day4_21Hw;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		while(true){
			Scanner scan = new Scanner(System.in);
			HomeWork5 hw = new HomeWork5();
			System.out.println("请随便输入一个姓名:");
			String name = scan.next();
			hw.getName(name);
		}
		

	}

	private void getName(String name) {
		final String[] baiJiaXing = { "赵", "钱", "孙", "李", "周", "吴", "郑", "王",
				"冯", "陈", "褚", "卫", "蒋", "沈", "韩", "杨", "朱", "秦", "尤", "许",
				"何", "吕", "施", "张", "孔", "曹", "严", "华", "金", "魏", "陶", "姜",
				"戚", "谢", "邹", "喻", "柏", "水", "窦", "章","刘", "欧阳", "上官", "司马", "东方",
				"孤独", "南宫", "夏侯", "诸葛", "公孙", "慕容", "长孙", "令狐", "司徒", "宇文",
				"申屠", "端木","西门"

		};
		// 把接收进来的名字拆成char数组
		char[] ca = name.toCharArray();
		// 把接收进来的第一个字赋给str1
		String str1 = "" + ca[0];
		// 把接收进来的第一和第二个字赋给str2
		String str2 = "" + ca[0] + ca[1];
		for (int i = 0; i < baiJiaXing.length; i++) {
			// 判断str1百家姓里有没有
			if (str1.equals(baiJiaXing[i])) {
				String[] split = name.split(baiJiaXing[i]);
				System.out.println("姓:" + baiJiaXing[i] + "\t名:" + split[1]);
				break;
				// 判断str2在百家姓有没有
			} else if (str2.equals(baiJiaXing[i])) {
				String[] split = name.split(baiJiaXing[i]);
				System.out.println("姓:" + baiJiaXing[i] + "\t名:" + split[1]);
				break;
			}
		}
	}
}
