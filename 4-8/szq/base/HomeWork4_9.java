package priv.szq.base;

import java.io.Console;
import java.util.Scanner;

public class HomeWork4_9 {

	
	public static void main(String[] args) {
	
//		 	homeW1();
//		 	homeW2();
//		 	homeW3();
//		 	homeW4();
//		 	homeW5();
//		 	homeW6();
//		 	homeW7();
//		 	homeW8();
//		 	//homeW9();
//		 	homeW10();
//		 	homeW11();
//		 	homeW12();
//		 	homeW13();
//		 	homeW14();
//		 	//homeW15();
//			//homeW16();
		//homeW17();
			//homeW18();
		//homeW19();
		//homeW20();
			}

			
			
	
	
	static void homeW1(){
		//1、有限5位数，个位数为6且能被3整除的五位数共有多少？
		System.out.println("---------------第一题----------------");
		
			int sum = 0;
		for (int i = 10006; i <= 99996; i+=10) {
			if (i%3==0) {
				sum++;
				
			}
		}
		System.out.println(sum);
		}
		
		
		
	
	static void homeW2(){
		System.out.println("---------------第二题----------------");
//		2、4位反序数，假设N是一个四位数，它的9倍恰好是其反序数，
//		求N。反序数就是将整数的数字倒过来的形成的整数。4321  1234
		int cont  = 0;
		String sss = "";
		String sum = "";
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		for (int i = 1000; i < 9999; i++) {
			
			sss = ""+i*9;
			sum1 = i%10;
			sum2 = (i/10)%10;
			sum3 =(i/100)%10;
			sum4 =(i/1000)%10;
			sum = (""+sum1+sum2+sum3+sum4);
			
			if(sum.equals(sss)){
				cont++;
			}
			
		}
		System.out.println("符合要求的四位数有:"+cont+"个");
		
	}
	

	
	
	static void homeW3(){
		System.out.println("---------------第三题----------------");
//		完全数：如果一个数恰好等于他的因子之和，
//		则成为“完全数”。如：6的因子是1、2、3，而6=1+2+3，
//		则6是个“完全数”。试求出1000以内的全部“完全数”。
		
			int sum =+0;
		for (int i = 1; i <1000; i++) {
			int cont = 0;
			for (int j = 1; j <i ; j++) {
				if(i%j==0){
					cont+=j;
				}
			}
			if(cont==i){
				sum++;
			}

		}

		System.out.println("1000以内的完全数共有："+sum+"个");
		
	}
	
	
	
	
	static void homeW4(){
		System.out.println("---------------第四题----------------");
//		和的平方数3025这个数具有一种独特的性质：将它评分为两段，即30和25，
//		使之相加后求方，即(30+25)的平方等于3025本身。
//		求具有这样性质的全部四位数。
//		这些数字满足 abcd=(ab+cd)*(ab+cd)的关系
		  int sum = 0;
		  
		for (int i = 1000; i < 9999; i++) {
			
			int ab = i/100;
			
			int cd = i%100;
			
			if((ab+cd)*(ab+cd)==i){
				sum++;
			}
			
		}
		System.out.println("满足条件的四位数有:"+sum+"个");
	}
	
	
	static void homeW5(){
//		打印出100-999之间的所有“水仙花数”。所谓“水仙花数”，
//		是指一个3位数，其各位数字立方和等于该数本身。
//		例如：153是一个水仙花数。
		
	System.out.println("---------------第五题----------------");
			int sum = 0;
			int sum1 = 0;
			int sum2 = 0;
			int sum3 = 0;
	for (int i = 100; i < 999; i++) {
		 sum1 = (int) Math.pow((i%10), 3);
		 sum2 = (int) Math.pow((i/10)%10, 3);
		 sum3 = (int) Math.pow((i/100)%10, 3);
		
		 if (sum1+sum2+sum3==i) {
			sum++;
		}
		
	}
	System.out.println("100~999之间水仙花数共有:"+sum+"个");
		
	}
	
	
	static void homeW6(){
		System.out.println("---------------第六题----------------");
//		6、学校2009年培养学生900人，每年增长25%，
//		请问按此速度增长，到哪一年培训学生人数将达到1万人。
		
		int year = 2009;
		int s = 900;
		double zz = 1+0.25;
		
		do {
			s*=zz;
			year++;
		} while (s<=10000);
		
		System.out.println("到"+year+"年培训学生达到1万人");
	}
	
	static void homeW7(){
		System.out.println("---------------第七题----------------");
		
		/*7、使用do-while实现：输出摄氏温度与华氏温度的对照表，
		要求它从摄氏温度0度到250度，每隔20度为一项，
		对照表中的条目不超过10条。转换关系：
		华氏温度 = 摄氏温度 * 9 / 5.0 + 32*/
		int sum = 1;
		int ss = 0;
		int hs = 0;
		do {
			ss+=20;
			hs = (int) (ss*9/5.0+32);
			System.out.println(ss+":"+hs);
			sum++;
			if (sum>10){
				break;
			}
				

		} while (ss<=250);
	}
	
	
	static void homeW8(){
		System.out.println("---------------第八题----------------");
		
//		8、求1~100之间不能被3整除的数之和
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if(i%3!=0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	
	
	static void homeW9(){
		System.out.println("---------------第九题----------------");
//		循环录入某学生5门课的成绩并计算平均分，
//		如果某分数录入为负，停止录入并提示录入错误
		int cont = 0;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入5门各科成绩");
			Scanner scan = new Scanner(System.in);
			int xk = scan.nextInt();
			if (xk>=0) {
				sum+=xk;
			}else {
				cont++;
				break;
			}
		}
		if (cont>=1) {
			System.out.println("程序终止！输入了负数");
		}else {
			System.out.println(sum/5);
		}
		
	}
	
	
	static void homeW10(){
		System.out.println("---------------第十题----------------");
		
//		10、1~10之间的整数相加，得到累加值大于20的当前数
		
		int sum = 0;
		for (int i = 1; i < 10; i++) {
				sum+=i;
			if (sum>20) {
				System.out.print(i+",");
			}
		}
		System.out.println();
	}
	static void homeW11(){
		System.out.println("---------------第十一题----------------");
		
//		11、求1~10之间的所有偶数和
		
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			if(i%2==0){
				sum+=i;
			}
			
		}
		System.out.println(sum);
	}
	
	
	static void homeW12(){
		System.out.println("---------------第十二题----------------");
		
		/*开发一个标题为"FlipFlop"的游戏应用程序。
		它从1计数到100，遇到3的倍数就替换为单词“Flip”
		，5的倍数就替换为单词“Flop","
				+ "既为3的倍数又为5的倍数则替换为单词"FlipFlop"
*/	
		
		for (int i = 1; i < 100; i++) {
			if(i%3==0&&i%5==0){
				System.out.println("FlipFlop");
			}else if(i%3==0){
				System.out.println("Flip");
			}else if (i%5==0) {
				System.out.print("Flop");
			}
		}
		
		
		
	}
	
	static void homeW13(){
		System.out.println("---------------第十三题----------------");
		
		/*山上有一口缸可以装50升水，现在有15升水。
		老和尚叫小和尚下山挑水，每次可以挑5升，
		问：小和尚要挑几次才可以把缸挑满？*/
		
		int cont = 0;
		for (int i = 16; i <= 50; i+=5) {
			
			cont++;
		}
		System.out.println("需要"+cont+"次可以挑满");
		
	}
	
	
	static void homeW14(){
		System.out.println("---------------第十四题----------------");
		
//		使用循环输出100,95,90,85……5。
		
		for (int i = 100; i>=5 ; i-=5) {
			System.out.print(i+",");
		}
	}
	
	static void homeW15(){
		System.out.println("---------------第十五题----------------");
/*		15、用户根据提示信息从键盘输入年份，
		按回车键后，输出该年是否为闰年。
		［提示：能被4整除但不能被100整除，或者能被400整除］。*/
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个年份:");
		int years = scan.nextInt();
		if (years%4==0||years%400==0) {
			if (years%100!=0) {
				System.out.println("您输入的是闰年");
			}
		}else {
			System.out.println("您输入的不是闰年");
		}
		
	}
	
	
	static void homeW16(){
	System.out.println("---------------第十六题----------------");
			int yandm = 0 ;
		/*16、从键盘输入年份和月份，
		如果月份是在1~2内，
		输出XX年X月X天;否则输出”输出月份不正确“*/
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年月");
		
		yandm = scan.nextInt();
		
		
		if ((yandm%100)>2) {
			System.out.println("输入的月份不正确");
		}else {
			
		}
	}
	
	
	static void homeW17(){
		System.out.println("---------------第十七题----------------");
		/*17、实现用户登录时的信息验证：
		登录时提示用户输入用户名和密码。
		验证用户名和密码的正确性系统提供用户有3次机会输入用户名和密码，
		如果超过3次仍不能匹配，程序结束。*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入账号:");
		String userdata = scan.next();
		System.out.println("请输入密码:");
		String passworddata = scan.next();
		int cont = 0;
		System.out.println("请输入验证账号");
		String checkuser = scan.next();
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入验证密码,只有三次机会");
			String checkpassword = scan.next();
			if (userdata.equals(checkuser)&&passworddata.equals(checkpassword)) {
				System.out.println("验证成功！！");
				break;
			}else {
				System.out.println("账号密码不匹配,请重新输入");
				cont++;
			}
			if (cont>=3) {
			System.out.println("验证失败！！！");
				break;
			}
		}
		
	}
	
	static void homeW18(){
		System.out.println("---------------第十八题----------------");
		
		/*18、判断用于输入的任一个数字是否是质数，
		（提示：质数是指只能被1和自己整除的数。
		要求只少要用二种方法实现）*/
		Scanner scan = new Scanner(System.in);
		int cont = 0;
		System.out.println("请输入任意一个整数");
		int sum = scan.nextInt();
		for (int i = 2; i < sum; i++) {
			if (sum%1==0&&sum%sum==0) {
				if (sum%i!=0) {
					cont++;
				}
			}
		}
		if (cont==sum-2) {
			System.out.println("是质数");
		}else {
			System.out.println("不是质数");
		}
	}
	static void homeW19(){
	System.out.println("---------------第十九题----------------");
//		四个连续的3位自然数的和是一个在400到440之间的三位数，
//		并且能被9整除，这四个自然数分别是多少？
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		for (int i = 100; i < 999; i++) {
			sum1 = i;
			sum2 = i+1;
			sum3 = i+2;
			sum4 = sum1+sum2+sum3;
			if (sum4>400&&sum4<440&&sum4%9==0) {
				System.out.println(sum4);
			}
		}
	}
	
	
	static void homeW20(){
//		有如下十个数字：1，1/2，1/3，1/4，1/5，
//		…………1/10请用java 
//		代码实现其数列之和。
			double cont = 1;
			int sum = 0;
			for (int i = 2; i <=10; i++) {
				sum+=cont/i;

		}
		System.out.println(sum+cont);
	}
	
}
