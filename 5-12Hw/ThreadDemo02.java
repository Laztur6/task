package priv.szq.base.hw5_12;
import org.apache.log4j.Logger;
public class ThreadDemo02 implements Runnable{
	private static final Logger logger = Logger.getLogger(ThreadDemo02.class);
	

	public void run() {
		int j;
		for (int i = 2; i <100; i++) {
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
			ThreadDemo02 t = new ThreadDemo02();
			Thread thread = new Thread(t);
			thread.start();
		
	}
	
}

