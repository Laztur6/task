package priv.szq.base.dy3Hw;

import java.util.Scanner;

public class PunchGame {

	User jia = new User();
	Machine yi = new Machine();

	int inning;

	public PunchGame() {
		jia.name = "����";
		inning = 0;
		start();
	}

	// ʯͷ:1 ����:2 ����3

	void start() {
		Scanner scan = new Scanner(System.in);
	System.out.println("*************��Ϸ��ʼ**************");
	System.out.println("��ѡ���ǳ� 1������ 2���ŷ� 3������ 4������");
		int namenum = scan.nextInt(); 
			jia.rename(namenum);
	while(true){
		System.out.println("����   1��ʯͷ    2������   3����   ����9�˳���ս");
		int nexti = scan.nextInt();
		if (nexti==9) {
			printResult();
		}else if(nexti>0&&nexti<4){
			jia.punch(nexti);
			yi.punch();
			Result(jia.pun, yi.pun);
		}

		System.out.println("**********************************");
		}


	}
	
	
//	������
	// -1 ��ʤ 0 ƽ�� 1 ��ʤ -2 ��ʤ 
	int Result(int a,int b ){
		switch (a-b) {
		case -1:
			jia.integral++;
			System.out.println(jia.name+"ʤ");
			break;
		case 0:
			System.out.println("ƽ��");
			break;
		case 1:
			yi.integral++;
			System.out.println(yi.name+"ʤ");
			break;
		case -2:
			yi.integral++;
			System.out.println(yi.name+"ʤ");
			break;
		default:
			break;
		}
		return 0 ;
	}
	
	void printResult(){
		System.out.println("�������,�������:");
		System.out.printf("%s��%s��",jia.name,jia.integral);
		System.out.printf("%s��%s��",yi.name,yi.integral);
		System.exit(0);
	}
	
		public static void main(String[] args) {
			new PunchGame();
		}
}
