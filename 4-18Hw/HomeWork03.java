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
		System.out.println("��Ҫ�����ʥ��");
	}}
class Boy implements ChiXiCan{

	public void DianCai() {
		System.out.println("��Ҫ�����ӿ���");
	}}
class Child implements ChiXiCan{

	public void DianCai() {
		System.out.println("��Ҫ��̢�ͱ����");
	}}