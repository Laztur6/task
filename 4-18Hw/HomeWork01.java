package priv.szq.base.day08Hw;

public class HomeWork01 {
	public static void main(String[] args) {
		Bus bus = null;
		System.out.println("想到哪里");
		bus = getBus("四水厂");
		bus.run();
		
	}
	static Bus getBus(String str){
		
		if (str.equals("四水厂")) {
			return new Bus118();
		}
		if (str.equals("矿院")) {
			return new Bus132();
			
		}
		
		return null;
		
	}
}
interface Bus{
	void run();
}
class Bus118 implements Bus{
	public void run() {
		System.out.println("我是118路,我到四水厂");
	}
	
}
class Bus132 implements Bus{

	public void run() {
		System.out.println("我是132路,我到矿院");
	}}