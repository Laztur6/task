package priv.szq.base.IO;
import java.awt.geom.Path2D;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;

import org.apache.log4j.Logger;
public class FileDemo2 {
	private static final Logger logger = Logger.getLogger(FileDemo2.class);
	
	public static void main(String[] args) {
		 String Path = "d:/111.png";
		 String Path2 = "e:/gits/copy.png";
		try (	InputStream is = new FileInputStream(Path);
				BufferedInputStream in = new BufferedInputStream(is);
				OutputStream out = new FileOutputStream(Path2);){
			
				int len;
				byte[] b = new byte[4096];
				while((len = in.read(b))!=-1){
					out.write(b, 0, len);
//					System.out.println(new String(b,0,len));
				}
			
		} catch (FileNotFoundException e) {
			logger.error(e);
		} catch (IOException e) {
			logger.error(e);
		}
		System.out.println("Over");
	}
}

