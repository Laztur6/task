package priv.szq.base.hw4_26;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.log4j.Logger;
public class HomeWork1 {
	private static final Logger logger = Logger.getLogger(HomeWork1.class);
	public static void main(String[] args) {
		String inpath = "E:\\HomeWork\\4-26Hw\\temp1.txt";
		String outpath = "E:\\HomeWork\\4-26Hw\\temp2.txt";
		try (		InputStream is = new FileInputStream(inpath);
					BufferedInputStream in = new BufferedInputStream(is);
					OutputStream os = new FileOutputStream(outpath);){
			int len = 0;
			byte[] b =  new byte[4096];
			
			while((len = in.read(b))!=-1){
				os.write(b, 0, len);
				System.out.println(new String(b,0,len));
			}

		} catch (FileNotFoundException e) {
			logger.error(e);
		} catch (IOException e1) {
			logger.error(e1);
		}
	}
}

