package priv.szq.base.day7Hw;

public class HomeWork03 {
	public static void main(String[] args) {
		Guest guest = new Guest();
		guest.buyHouse(new Agency(new Landlord()));
		
	}
}
abstract class Seller{//卖家
	abstract void qianHeTong();
	abstract void transfer();
};
class Guest{

	public void buyHouse(Seller seller) {
			System.out.println("买家:这个房子我可以,我们签合同吧!");
			seller.qianHeTong();
			System.out.println("买家:钱转了,确认一下，去过户吧");
			seller.transfer();
			System.out.println("买家:买房完成");
	}};
class Agency extends Seller{
	private Seller seller;
//中介

	void qianHeTong() {
		System.out.println("中介:好的,稍等我要房主跟你签合同");
		seller.qianHeTong();
	}
	public Agency(Seller seller) {
		this.seller = seller;
		
	}
	void transfer() {
		seller.transfer();
	}};
class Landlord extends Seller{//房主

	void qianHeTong() {
		System.out.println("房主:合同签完了,钱转完我们就可以去过户了");
	}

	void transfer() {
		System.out.println("房主:过完户了,房子是你的了");
	}}
