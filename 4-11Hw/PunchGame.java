package priv.szq.base.dy3Hw;

import java.util.Scanner;

public class PunchGame {

	User jia = new User();
	Machine yi = new Machine();

	int inning;

	public PunchGame() {
		jia.name = "匿名";
		inning = 0;
		start();
	}

	// 石头:1 剪刀:2 布：3

	void start() {
		Scanner scan = new Scanner(System.in);
	System.out.println("*************游戏开始**************");
	System.out.println("请选择昵称 1、赵云 2、张飞 3、关羽 4、黄忠");
		int namenum = scan.nextInt(); 
			jia.rename(namenum);
	while(true){
		System.out.println("规则   1：石头    2：剪刀   3：布   输入9退出对战");
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
	
	
//	计算结果
	// -1 甲胜 0 平局 1 乙胜 -2 乙胜 
	int Result(int a,int b ){
		switch (a-b) {
		case -1:
			jia.integral++;
			System.out.println(jia.name+"胜");
			break;
		case 0:
			System.out.println("平局");
			break;
		case 1:
			yi.integral++;
			System.out.println(yi.name+"胜");
			break;
		case -2:
			yi.integral++;
			System.out.println(yi.name+"胜");
			break;
		default:
			break;
		}
		return 0 ;
	}
	
	void printResult(){
		System.out.println("程序结束,比赛结果:");
		System.out.printf("%s得%s分",jia.name,jia.integral);
		System.out.printf("%s得%s分",yi.name,yi.integral);
		System.exit(0);
	}
	
		public static void main(String[] args) {
			new PunchGame();
		}
}
