package priv.szq.base.day7Hw;

public class HomeWork02 {
	public static void main(String[] args) {
		Person person = getGuest();
		person.haircut();
	}
	static Person getGuest(){
		Person [] persons = 
		   {new man(),new woman(),new oldman(),new child()};
		
		return persons[(int) (Math.random()*4)];
	}
}

abstract class Person {

	void haircut() {
		System.out.println("����:��ʲô������");
		faXing();
		System.out.println("����:�鷳ǰ̨��һ�¿�");
		money();
	};

	abstract void faXing();

	abstract void money();
};

class man extends Person {

	void faXing() {
		System.out.println("��ʿ:ƽͷ");
	}

	void money() {
		System.out.println("��ʿ:����30Ԫ");
	}

};

class woman extends Person {

	void faXing() {
		System.out.println("Ůʿ:��������");
	}

	void money() {
		System.out.println("Ůʿ:����128Ԫ");
	}

};

class oldman extends Person {

	void faXing() {
		System.out.println("����:���");
	}

	void money() {
		System.out.println("����:����20Ԫ");
	}

};

class child extends Person {

	void faXing() {
		System.out.println("С��:������");
	}

	void money() {
		System.out.println("С��:����80Ԫ");
	}

};