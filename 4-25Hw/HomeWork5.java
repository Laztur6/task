package priv.szq.base.homework;
public class HomeWork5 {
	public static void main(String[] args) {
//		�塢��д�ܲ���ArrayIndexOutOfBoundsException�쳣�Ĵ��룬
//		�����䲶���ڿ���̨������쳣��Ϣ��
		
		try {
			int [] a = new int [1];
			
			a[3] = 30;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

