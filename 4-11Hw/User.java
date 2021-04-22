package priv.szq.base.dy3Hw;

import java.util.Scanner;

public class User {

	String name;

	int integral;
	int pun = 0;
	void punch(int a) {
		
			switch (a) {
			case 1:
				System.out.println(name+":出的石头");
				break;
			case 2:
				System.out.println(name+":出的剪刀");
				break;
			case 3:
				System.out.println(name+":出的布");
				break;
			default:
				break;
			}
			

	}

	// 改名 1、赵云 2、张飞 3、关羽 4、黄忠
	 void rename(int i) {
		switch (i) {
		case 1:
			name = "赵云";
			break;
		case 2:
			name = "张飞";
			break;
		case 3:
			name = "关羽";
			break;
		case 4:
			name = "黄忠";
			break;
		default:
			break;
		}
	}

}
