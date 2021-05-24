package priv.szq.base.hw5_12;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;
public class ThreadDemo03 {
	private static final Logger logger = Logger.getLogger(ThreadDemo03.class);
	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				int j;
				for (int i = 2; i < 100; i++) {
					j=2;
					while (i%j!=0) {
						j++;
					}
					if (i==j) {
						System.out.println(i);
						
					}
				}
			}
		};
		pool.execute(r);
		pool.shutdown();
	}
}

