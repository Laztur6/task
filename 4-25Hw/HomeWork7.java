package priv.szq.base.homework;

public class HomeWork7 {
//	��дһ���ܲ�����ָ���쳣�Ĵ��룬
//	�������쳣������ƽ��д������ж���finally������Ƿ��׳����쳣��
//	����ʾ����Ϊ�����Ƿ����쳣�������finally���У���
	public static void main(String[] args) {
		test();
	}

private static void test() {
	int sum = 0;
	try {
		Person person = null;
		person.toString();
	} catch (Exception e) {
		sum++;
		e.printStackTrace();
	}finally{
		if (sum>0) {
			System.out.println("�����쳣��,�Ѿ�������");
		}
	}
}
}

class Person{}
