package priv.szq.base.hw4_26;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.Attributes.Name;

import org.apache.log4j.Logger;

public class HomeWork2 {
	private static final Logger logger = Logger.getLogger(HomeWork2.class);
	public static void main(String[] args) {
		String passWord = "szq123456";
		
		byte[] bytes = passWord.getBytes();
		
		MyInputStream mis = new MyInputStream(bytes);
		int len = 0;
		try {
			while ((len  = mis.read(bytes))!= -1) {
				System.out.println(new String(bytes,0,len));
			}
		} catch (IOException e) {
			logger.error(e);
		}
		
	}
}

class MyInputStream extends InputStream {
	//需要处理的数组
	byte [] data;
	
	//开始位置
	int start;
	

	public MyInputStream(byte[] data) {
		this.data = data;
	}


	public int read() throws IOException {
		if (start<data.length) {
			return data[start++]+1;
		}else {
			return -1;
		}
	}


	
}