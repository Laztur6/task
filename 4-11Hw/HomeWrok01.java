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
//		5�����߳�ͬѧ�����а����ڴ���ѡ����1�궨�ڣ�
//		ÿ�굽�ں�Ϣת��ķ�ʽ��1�궨�ڵ�����Ϊ1.98%��
//		�Զ��巽��CalculateSaving,ͨ������Ĵ����ʹ���
//		�����㵽�ں�ı�Ϣ�ܶ

		Scanner scan = new Scanner(System.in);
		System.out.println("����������");
		double	mon = scan.nextDouble();
		System.out.println("������������");
		int year = scan.nextInt();
		double lilv = 0.0198;
		double	sum = mon*Math.pow((1+lilv), year);
		
		System.out.println(sum);
		
		
		
	}
	
	
	static void CalculateMoney(int mon) {
		
		// ����������ҵ����ң��������ǡ��֣���������6����ֵֽ�ң�
		// 1Ԫ��5Ԫ��10Ԫ��20Ԫ��50Ԫ��100Ԫ���Զ��巽��CalculateMoney��
		// ����Ҫ���⼸��ֽ����ɽ�X����������Ҫ����ֽ�ҡ�

		int[] Money = { 1, 5, 10, 20, 50, 100 };
		int sum = 0;// ��¼��Ǯ����
		int cont = 1;

		while (true) { // ��ѭ��
			if (mon == 0) {// �ж�����Ľ���Ƿ���Ϊ0��
				break;
			} // �ж�����Ľ���Ƿ����Money��������ֵ
				// ���������cont+1��
			if (mon >= Money[Money.length - cont]) {

				mon -= Money[Money.length - cont];
				sum++;
			} else {
				// �ж�cont�Ƿ�������鳤��
				if (cont < Money.length) {
					cont++;
					continue;
				}

			}

		}
		System.out.println(sum);
	}

}
