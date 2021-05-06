package priv.szq.base.homework;

public class HomeWork2 {
//	二、用程序描述黄河和长江，
//	假设黄河水位高了警戒水位5m时决堤，
//	长江水位高出警戒水位9m时决堤。
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
			throw new Exception("黄河要决堤了");
			
		}
	}
	
}
class ChangJiang{
	int jingJie;

	public ChangJiang(int jingJie) throws Exception {
		this.jingJie = jingJie;
		if (jingJie>=9) {
			throw new Exception("长江决堤了");
			
		}
	}
	
}