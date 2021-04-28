package priv.szq.base.day7Hw;

public class HomeWork03 {
	public static void main(String[] args) {
		Guest guest = new Guest();
		guest.buyHouse(new Agency(new Landlord()));
		
	}
}
abstract class Seller{//����
	abstract void qianHeTong();
	abstract void transfer();
};
class Guest{

	public void buyHouse(Seller seller) {
			System.out.println("���:��������ҿ���,����ǩ��ͬ��!");
			seller.qianHeTong();
			System.out.println("���:Ǯת��,ȷ��һ�£�ȥ������");
			seller.transfer();
			System.out.println("���:�����");
	}};
class Agency extends Seller{
	private Seller seller;
//�н�

	void qianHeTong() {
		System.out.println("�н�:�õ�,�Ե���Ҫ��������ǩ��ͬ");
		seller.qianHeTong();
	}
	public Agency(Seller seller) {
		this.seller = seller;
		
	}
	void transfer() {
		seller.transfer();
	}};
class Landlord extends Seller{//����

	void qianHeTong() {
		System.out.println("����:��ͬǩ����,Ǯת�����ǾͿ���ȥ������");
	}

	void transfer() {
		System.out.println("����:���껧��,�����������");
	}}
