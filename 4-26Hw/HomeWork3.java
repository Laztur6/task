package priv.szq.base.hw4_26;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
public class HomeWork3 {
	private static final Logger logger = Logger.getLogger(HomeWork3.class);
	public static void main(String[] args) {
		
		String inpath = "D:\\studyvideo\\Exception01.wmv";
		String outpath = "E:\\HomeWork\\4-26Hw\\aaa.wmv";
		try (FileInputStream is = new FileInputStream(inpath);
				BufferedInputStream bis = new BufferedInputStream(is);
				FileOutputStream fos = new FileOutputStream(outpath);){
			
			int len;
			byte[] b = new byte[4096];
			while ((len = bis.read(b))!=-1) {
				fos.write(b, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			logger.error(e);
		} catch (IOException e1) {
			logger.error(e1);
		}
	}
}

