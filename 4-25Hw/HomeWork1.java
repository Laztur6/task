package priv.szq.base.homework;

public class HomeWork1 {
	// 一、“君不见黄河之水天上来，奔流到海不复回”，
		// 描述的是我们的母亲河—黄河，但是状观的河水有时也会引发灾害，
		// 为了控制灾害造成的损失，就要及时对灾害进行处理。
		// 用面向对象的编程方式描述这一自然现象。
	
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
			throw new Exception("黄河要决堤了,请马上离开");
		}
	}
	
}

