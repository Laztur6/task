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
		System.out.println("理发店:理什么发型呢");
		faXing();
		System.out.println("理发店:麻烦前台付一下款");
		money();
	};

	abstract void faXing();

	abstract void money();
};

class man extends Person {

	void faXing() {
		System.out.println("男士:平头");
	}

	void money() {
		System.out.println("男士:给了30元");
	}

};

class woman extends Person {

	void faXing() {
		System.out.println("女士:空气刘海");
	}

	void money() {
		System.out.println("女士:给了128元");
	}

};

class oldman extends Person {

	void faXing() {
		System.out.println("老人:板寸");
	}

	void money() {
		System.out.println("老人:给了20元");
	}

};

class child extends Person {

	void faXing() {
		System.out.println("小孩:非主流");
	}

	void money() {
		System.out.println("小孩:给了80元");
	}

};