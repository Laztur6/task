package priv.szq.base.day08Hw;

public class HomeWork02 {
	public static void main(String[] args) {
		ZhuangShi ren = new Ren();
		ZhuangShi maoyi = new MaoYi(ren);
		ZhuangShi chenShan = new ChenShan(maoyi);
		chenShan.show();
		
		
		
	}
}
interface ZhuangShi{
	void show();
}
class MaoYi implements ZhuangShi{

	private ZhuangShi zs;

	public MaoYi(ZhuangShi zs) {
		this.zs = zs;
	}

	public void show() {
		System.out.println("����ë��");
		zs.show();
	}}
class ChenShan implements ZhuangShi{

	private ZhuangShi zs;

	public ChenShan(ZhuangShi zs) {
		this.zs = zs;
		
	}

	public void show() {
		System.out.println("���ǳ���");
		zs.show();
	}}
class XiZhuang implements ZhuangShi{

	private ZhuangShi zs;

	public void show() {
		System.out.println("������װ");
		zs.show();
		
	}}
class Ren implements ZhuangShi{

	public void show() {
		System.out.println("������,��Ҫ���·�");
	}
	
}