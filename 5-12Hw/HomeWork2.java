package priv.szq.base.hw5_12;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.log4j.Logger;
public class HomeWork2 {
	private static final Logger logger = Logger.getLogger(HomeWork2.class);
	public static void main(String[] args) {
		Player player1 = new Player();
		while (true) {
			if (player1.getMoney()>0) {
				gameStart(player1);
			}else {
			System.out.println("ûǮ��");
				break;
			}
			
		}
		
	}


	public static void gameStart(Player player){
		System.out.println("��ӭ�����������ӡ�С��Ϸ����");
		System.out.println("����ӵ��"+player.getMoney()+"���");
		System.out.println("������   1:��      2:С");
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		System.out.println("��������");
		int pm = scan.nextInt();
		ExecutorService pool = Executors.newCachedThreadPool();
		 Callable<Integer> callable = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				return (int) (Math.random()*6+1);
			}
			 
		};
		Integer i1 = null;
		Integer i2 = null;
		Integer i3 = null;
		try {
			i1 = pool.submit(callable).get();
			 i2= pool.submit(callable).get();
			 i3 = pool.submit(callable).get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

		System.out.println("-----------�����֣�����--------------");
		System.out.print(i1+"\t");
		System.out.print(i2+"\t");
		System.out.println(i3+"\t");
		int a = i1+i2+i3;
		int bigOrSm = 0;
		if (a<=9) {
			System.out.println(a+"��:С");
			bigOrSm = 2;
		}else{
			System.out.println(a+"��:��");
			bigOrSm = 1;
		}
		pool.shutdown();
		if (p==bigOrSm) {
			player.setMoney(player.getMoney()+pm);
			System.out.println("��ϲ,���"+pm+"���ڽ��Ϊ:"+player.getMoney());
		}else {
			player.setMoney(player.getMoney()-pm);
			System.out.println("���ź�,����"+pm+"���ڽ��Ϊ:"+player.getMoney());
		}
		System.out.println("----------------------------------------------");
	}
	
	
}

class Player{
	private  int money = 1000;

	public Player() {
		super();
	}

	public Player(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}