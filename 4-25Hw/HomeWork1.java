package priv.szq.base.homework;

public class HomeWork1 {
	// һ�����������ƺ�֮ˮ���������������������ء���
		// �����������ǵ�ĸ�׺ӡ��ƺӣ�����״�۵ĺ�ˮ��ʱҲ�������ֺ���
		// Ϊ�˿����ֺ���ɵ���ʧ����Ҫ��ʱ���ֺ����д���
		// ���������ı�̷�ʽ������һ��Ȼ����
	
	public static void main(String[] args) {
		try {
			new Huanghe1(10,8);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
class Huanghe1{
	int shuiWei;
	int zuiDa;
	public Huanghe1(int shuiWei,int zuiDa) throws Exception {
		this.shuiWei = shuiWei;
		if (shuiWei>zuiDa) {
			throw new Exception("�ƺ�Ҫ������,�������뿪");
		}
	}
	
}

