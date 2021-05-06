package priv.szq.base.homework;
public class HomeWork5 {
	public static void main(String[] args) {
//		五、编写能产生ArrayIndexOutOfBoundsException异常的代码，
//		并将其捕获，在控制台上输出异常信息。
		
		try {
			int [] a = new int [1];
			
			a[3] = 30;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

