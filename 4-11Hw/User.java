package priv.szq.base.dy3Hw;

import java.util.Scanner;

public class User {

	String name;

	int integral;
	int pun = 0;
	void punch(int a) {
		
			switch (a) {
			case 1:
				System.out.println(name+":����ʯͷ");
				break;
			case 2:
				System.out.println(name+":���ļ���");
				break;
			case 3:
				System.out.println(name+":���Ĳ�");
				break;
			default:
				break;
			}
			

	}

	// ���� 1������ 2���ŷ� 3������ 4������
	 void rename(int i) {
		switch (i) {
		case 1:
			name = "����";
			break;
		case 2:
			name = "�ŷ�";
			break;
		case 3:
			name = "����";
			break;
		case 4:
			name = "����";
			break;
		default:
			break;
		}
	}

}
