package priv.szq.base.day4_21Hw;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {
		while(true){
			Scanner scan = new Scanner(System.in);
			HomeWork5 hw = new HomeWork5();
			System.out.println("���������һ������:");
			String name = scan.next();
			hw.getName(name);
		}
		

	}

	private void getName(String name) {
		final String[] baiJiaXing = { "��", "Ǯ", "��", "��", "��", "��", "֣", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "ʩ", "��", "��", "��", "��", "��", "��", "κ", "��", "��",
				"��", "л", "��", "��", "��", "ˮ", "�", "��","��", "ŷ��", "�Ϲ�", "˾��", "����",
				"�¶�", "�Ϲ�", "�ĺ�", "���", "����", "Ľ��", "����", "���", "˾ͽ", "����",
				"����", "��ľ","����"

		};
		// �ѽ��ս��������ֲ��char����
		char[] ca = name.toCharArray();
		// �ѽ��ս����ĵ�һ���ָ���str1
		String str1 = "" + ca[0];
		// �ѽ��ս����ĵ�һ�͵ڶ����ָ���str2
		String str2 = "" + ca[0] + ca[1];
		for (int i = 0; i < baiJiaXing.length; i++) {
			// �ж�str1�ټ�������û��
			if (str1.equals(baiJiaXing[i])) {
				String[] split = name.split(baiJiaXing[i]);
				System.out.println("��:" + baiJiaXing[i] + "\t��:" + split[1]);
				break;
				// �ж�str2�ڰټ�����û��
			} else if (str2.equals(baiJiaXing[i])) {
				String[] split = name.split(baiJiaXing[i]);
				System.out.println("��:" + baiJiaXing[i] + "\t��:" + split[1]);
				break;
			}
		}
	}
}
