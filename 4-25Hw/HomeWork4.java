package priv.szq.base.homework;

public class HomeWork4 {

	public static void foo(int i) throws Exception {
		try {
			if (i == 1) {
				throw new Exception();
			}
			System.out.print("1");
		} catch (Exception e) {
			System.out.print("2");
		} finally {
			System.out.print("3");
		}
		System.out.print("4");
	}

	public static void main(String[] args) throws Exception{
					foo(1);
					
			System.out.println("��Ϊ�����������쳣,catch�Ჶ��,�������������");
			System.out.println("finally������������Զ�ᱻִ�е�,");
			System.out.println("��Ϊ�������쳣�����Գ��򲻻���ֹ,�����к�������");
			
//	try{
//	������û���쳣
//	------�쳣��֮��Ĵ��벻ִ��
//	}catch(Exception e){
//		�������ܵ����쳣
//	}finally{
//		�������쳣��ִ��
//	}
	}
}
