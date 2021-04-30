package priv.szq.base.day08Hw;

public class HomeWork03 {
	public static void main(String[] args) {
		ChiXiCan girl = new Girl();
		girl.DianCai();
		ChiXiCan boy = new Boy();
		boy.DianCai();
		ChiXiCan child = new Child();
		child.DianCai();
		
	}
}
interface ChiXiCan{
	void DianCai();
}
class Girl implements ChiXiCan{

	public void DianCai() {
		System.out.println("我要烤翅和圣代");
	}}
class Boy implements ChiXiCan{

	public void DianCai() {
		System.out.println("我要汉堡加可乐");
	}}
class Child implements ChiXiCan{

	public void DianCai() {
		System.out.println("我要蛋挞和冰淇淋");
	}}