package priv.szq.base.homework;

public class HomeWork8 {
	// �������f(2)�������������Ƕ��٣�
	public static void main(String[] args) {
		System.out.println(f(2));
		System.out.println("finally����ǰ���صĸ�����");
	}
	public static int f(int n) {
		try {
			int r = n * n;
			return r;
		} finally {
			if (n == 2)
				return 0;
		}
	}
	

}
