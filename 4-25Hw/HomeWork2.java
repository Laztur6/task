package priv.szq.base.homework;

public class HomeWork2 {
//	�����ó��������ƺӺͳ�����
//	����ƺ�ˮλ���˾���ˮλ5mʱ���̣�
//	����ˮλ�߳�����ˮλ9mʱ���̡�
	public static void main(String[] args) {
		try {
			new HuangHe(5);
			new ChangJiang(9);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class HuangHe{
	int jingJie;

	public HuangHe(int jingJie) throws Exception {
		jingJie = jingJie;
		if (jingJie>=5) {
			throw new Exception("�ƺ�Ҫ������");
			
		}
	}
	
}
class ChangJiang{
	int jingJie;

	public ChangJiang(int jingJie) throws Exception {
		this.jingJie = jingJie;
		if (jingJie>=9) {
			throw new Exception("����������");
			
		}
	}
	
}