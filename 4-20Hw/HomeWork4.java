package priv.szq.base.day4_21Hw;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		addMoney();
	}

	private static void addMoney() {
		String a = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("�밴�����ʽ����");
		System.out.println("��ʽ:��ֵ������#��ֵ������#��ֵ���ֻ�����");
		String str = scan.next();
		String[] split = str.split("#");
		System.out.println("��ȷ���ֻ������Ƿ���ȷ:"+split[2]);
		System.out.println("��1ȷ��,��������˳�");
		String next = scan.next();
		if (next.equals("1")) {

			System.out.println("��ֵ�ɹ�"); 
		}else {
			System.out.println("��ֵʧ��,�������");
			System.exit(0);
		}
	}
}
