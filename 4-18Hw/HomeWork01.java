package priv.szq.base.day08Hw;

public class HomeWork01 {
	public static void main(String[] args) {
		Bus bus = null;
		System.out.println("�뵽����");
		bus = getBus("��ˮ��");
		bus.run();
		
	}
	static Bus getBus(String str){
		
		if (str.equals("��ˮ��")) {
			return new Bus118();
		}
		if (str.equals("��Ժ")) {
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
		System.out.println("����118·,�ҵ���ˮ��");
	}
	
}
class Bus132 implements Bus{

	public void run() {
		System.out.println("����132·,�ҵ���Ժ");
	}}