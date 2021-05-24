package priv.szq.base.hw5_12;
import org.apache.log4j.Logger;
public class ThreadDemo01 extends Thread{
	private static final Logger logger = Logger.getLogger(ThreadDemo01.class);
	@Override
	public void run() {
		int j;
		for (int i = 2; i < 100; i++) {
			j=2;
			while (i%j!=0) {
				j++;
			}
			if (j==i) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo01 t = new ThreadDemo01();
		t.start();
	}
}

