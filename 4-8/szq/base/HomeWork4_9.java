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
		//1������5λ������λ��Ϊ6���ܱ�3��������λ�����ж��٣�
		System.out.println("---------------��һ��----------------");
		
			int sum = 0;
		for (int i = 10006; i <= 99996; i+=10) {
			if (i%3==0) {
				sum++;
				
			}
		}
		System.out.println(sum);
		}
		
		
		
	
	static void homeW2(){
		System.out.println("---------------�ڶ���----------------");
//		2��4λ������������N��һ����λ��������9��ǡ�����䷴������
//		��N�����������ǽ����������ֵ��������γɵ�������4321  1234
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
		System.out.println("����Ҫ�����λ����:"+cont+"��");
		
	}
	

	
	
	static void homeW3(){
		System.out.println("---------------������----------------");
//		��ȫ�������һ����ǡ�õ�����������֮�ͣ�
//		���Ϊ����ȫ�������磺6��������1��2��3����6=1+2+3��
//		��6�Ǹ�����ȫ�����������1000���ڵ�ȫ������ȫ������
		
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

		System.out.println("1000���ڵ���ȫ�����У�"+sum+"��");
		
	}
	
	
	
	
	static void homeW4(){
		System.out.println("---------------������----------------");
//		�͵�ƽ����3025���������һ�ֶ��ص����ʣ���������Ϊ���Σ���30��25��
//		ʹ֮��Ӻ��󷽣���(30+25)��ƽ������3025����
//		������������ʵ�ȫ����λ����
//		��Щ�������� abcd=(ab+cd)*(ab+cd)�Ĺ�ϵ
		  int sum = 0;
		  
		for (int i = 1000; i < 9999; i++) {
			
			int ab = i/100;
			
			int cd = i%100;
			
			if((ab+cd)*(ab+cd)==i){
				sum++;
			}
			
		}
		System.out.println("������������λ����:"+sum+"��");
	}
	
	
	static void homeW5(){
//		��ӡ��100-999֮������С�ˮ�ɻ���������ν��ˮ�ɻ�������
//		��ָһ��3λ�������λ���������͵��ڸ�������
//		���磺153��һ��ˮ�ɻ�����
		
	System.out.println("---------------������----------------");
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
	System.out.println("100~999֮��ˮ�ɻ�������:"+sum+"��");
		
	}
	
	
	static void homeW6(){
		System.out.println("---------------������----------------");
//		6��ѧУ2009������ѧ��900�ˣ�ÿ������25%��
//		���ʰ����ٶ�����������һ����ѵѧ���������ﵽ1���ˡ�
		
		int year = 2009;
		int s = 900;
		double zz = 1+0.25;
		
		do {
			s*=zz;
			year++;
		} while (s<=10000);
		
		System.out.println("��"+year+"����ѵѧ���ﵽ1����");
	}
	
	static void homeW7(){
		System.out.println("---------------������----------------");
		
		/*7��ʹ��do-whileʵ�֣���������¶��뻪���¶ȵĶ��ձ�
		Ҫ�����������¶�0�ȵ�250�ȣ�ÿ��20��Ϊһ�
		���ձ��е���Ŀ������10����ת����ϵ��
		�����¶� = �����¶� * 9 / 5.0 + 32*/
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
		System.out.println("---------------�ڰ���----------------");
		
//		8����1~100֮�䲻�ܱ�3��������֮��
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if(i%3!=0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	
	
	static void homeW9(){
		System.out.println("---------------�ھ���----------------");
//		ѭ��¼��ĳѧ��5�ſεĳɼ�������ƽ���֣�
//		���ĳ����¼��Ϊ����ֹͣ¼�벢��ʾ¼�����
		int cont = 0;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("������5�Ÿ��Ƴɼ�");
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
			System.out.println("������ֹ�������˸���");
		}else {
			System.out.println(sum/5);
		}
		
	}
	
	
	static void homeW10(){
		System.out.println("---------------��ʮ��----------------");
		
//		10��1~10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ��
		
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
		System.out.println("---------------��ʮһ��----------------");
		
//		11����1~10֮�������ż����
		
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			if(i%2==0){
				sum+=i;
			}
			
		}
		System.out.println(sum);
	}
	
	
	static void homeW12(){
		System.out.println("---------------��ʮ����----------------");
		
		/*����һ������Ϊ"FlipFlop"����ϷӦ�ó���
		����1������100������3�ı������滻Ϊ���ʡ�Flip��
		��5�ı������滻Ϊ���ʡ�Flop","
				+ "��Ϊ3�ı�����Ϊ5�ı������滻Ϊ����"FlipFlop"
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
		System.out.println("---------------��ʮ����----------------");
		
		/*ɽ����һ�ڸ׿���װ50��ˮ��������15��ˮ��
		�Ϻ��н�С������ɽ��ˮ��ÿ�ο�����5����
		�ʣ�С����Ҫ�����βſ��԰Ѹ�������*/
		
		int cont = 0;
		for (int i = 16; i <= 50; i+=5) {
			
			cont++;
		}
		System.out.println("��Ҫ"+cont+"�ο�������");
		
	}
	
	
	static void homeW14(){
		System.out.println("---------------��ʮ����----------------");
		
//		ʹ��ѭ�����100,95,90,85����5��
		
		for (int i = 100; i>=5 ; i-=5) {
			System.out.print(i+",");
		}
	}
	
	static void homeW15(){
		System.out.println("---------------��ʮ����----------------");
/*		15���û�������ʾ��Ϣ�Ӽ���������ݣ�
		���س�������������Ƿ�Ϊ���ꡣ
		����ʾ���ܱ�4���������ܱ�100�����������ܱ�400�����ݡ�*/
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ�����:");
		int years = scan.nextInt();
		if (years%4==0||years%400==0) {
			if (years%100!=0) {
				System.out.println("�������������");
			}
		}else {
			System.out.println("������Ĳ�������");
		}
		
	}
	
	
	static void homeW16(){
	System.out.println("---------------��ʮ����----------------");
			int yandm = 0 ;
		/*16���Ӽ���������ݺ��·ݣ�
		����·�����1~2�ڣ�
		���XX��X��X��;�������������·ݲ���ȷ��*/
		Scanner scan = new Scanner(System.in);
		System.out.println("����������");
		
		yandm = scan.nextInt();
		
		
		if ((yandm%100)>2) {
			System.out.println("������·ݲ���ȷ");
		}else {
			
		}
	}
	
	
	static void homeW17(){
		System.out.println("---------------��ʮ����----------------");
		/*17��ʵ���û���¼ʱ����Ϣ��֤��
		��¼ʱ��ʾ�û������û��������롣
		��֤�û������������ȷ��ϵͳ�ṩ�û���3�λ��������û��������룬
		�������3���Բ���ƥ�䣬���������*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������˺�:");
		String userdata = scan.next();
		System.out.println("����������:");
		String passworddata = scan.next();
		int cont = 0;
		System.out.println("��������֤�˺�");
		String checkuser = scan.next();
		for (int i = 0; i < 3; i++) {
			System.out.println("��������֤����,ֻ�����λ���");
			String checkpassword = scan.next();
			if (userdata.equals(checkuser)&&passworddata.equals(checkpassword)) {
				System.out.println("��֤�ɹ�����");
				break;
			}else {
				System.out.println("�˺����벻ƥ��,����������");
				cont++;
			}
			if (cont>=3) {
			System.out.println("��֤ʧ�ܣ�����");
				break;
			}
		}
		
	}
	
	static void homeW18(){
		System.out.println("---------------��ʮ����----------------");
		
		/*18���ж������������һ�������Ƿ���������
		����ʾ��������ָֻ�ܱ�1���Լ�����������
		Ҫ��ֻ��Ҫ�ö��ַ���ʵ�֣�*/
		Scanner scan = new Scanner(System.in);
		int cont = 0;
		System.out.println("����������һ������");
		int sum = scan.nextInt();
		for (int i = 2; i < sum; i++) {
			if (sum%1==0&&sum%sum==0) {
				if (sum%i!=0) {
					cont++;
				}
			}
		}
		if (cont==sum-2) {
			System.out.println("������");
		}else {
			System.out.println("��������");
		}
	}
	static void homeW19(){
	System.out.println("---------------��ʮ����----------------");
//		�ĸ�������3λ��Ȼ���ĺ���һ����400��440֮�����λ����
//		�����ܱ�9���������ĸ���Ȼ���ֱ��Ƕ��٣�
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
//		������ʮ�����֣�1��1/2��1/3��1/4��1/5��
//		��������1/10����java 
//		����ʵ��������֮�͡�
			double cont = 1;
			int sum = 0;
			for (int i = 2; i <=10; i++) {
				sum+=cont/i;

		}
		System.out.println(sum+cont);
	}
	
}
