package priv.szq.base.IO;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Path;

import org.apache.log4j.Logger;
public class ReadFileDemo {
	private static final Logger logger = Logger.getLogger(ReadFileDemo.class);
		
	public static void main(String[] args) {
		OutputStream out ;
		try {
			out = new FileOutputStream("e:\\2.txt");
			System.setOut(new PrintStream(out));
		} catch (FileNotFoundException e1) {
			logger.error(e1);
		}
		
		String Path = "E:\\gits\\git±Ê¼Ç.txt";
		try (InputStream is = new FileInputStream(Path);
			BufferedInputStream in = new BufferedInputStream(is);)
				{
			byte [] b = new byte[4096];
			int len;
			while((len = in.read(b))!=-1){
				System.out.println(new String(b,0,len));
				
			}

		} catch (FileNotFoundException e) {
			logger.error(e);
		} catch (IOException e) {
			logger.error(e);
		}
		
	}
}

