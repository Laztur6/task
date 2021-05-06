package priv.szq.base.homework;
import org.apache.log4j.Logger;
public class HomeWork6 {
	private static final Logger logger = Logger.getLogger(HomeWork6.class);
	public static void main(String[] args) {
		
		try {
			int [] a = new int [1];
			a[3]=1;
		} catch (Exception e) {
			logger.error(e);
		}
	}
}


