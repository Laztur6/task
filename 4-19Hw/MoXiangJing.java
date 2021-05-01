package priv.szq.base.day4_19Hw2;

public class MoXiangJing {
	class ShuiSheng extends Shui{}
	class BuRu extends Bu{}
	private ShuiSheng s;
	private BuRu b;
	public MoXiangJing() {
		this.s = new ShuiSheng();
		this.b = new BuRu();
	}
	void swing(){
		s.swing();
	}
	void taiSheng(){
		b.taiSheng();
	}
	public static void main(String[] args) {
				MoXiangJing mxj = new MoXiangJing();
				mxj.swing();
				mxj.taiSheng();
	}
}
class Shui{
	void swing(){
		System.out.println("我会游泳");
	}
}
class Bu{
	void taiSheng(){
		System.out.println("我是胎生");
	}
}