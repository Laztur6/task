package priv.szq.base.day4_23Hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		while (true) {
			JiSuanNianJi();
		}
		
	}

	private static void JiSuanNianJi() {
		Scanner scan = new Scanner(System.in);
		List ageList = new ArrayList();
		Person person;
		System.out.println("请输入要计算的年龄:");
		int age = scan.nextInt();
		ageList.add(new Person(0, 12, "童年"));
		ageList.add(new Person(12, 23, "少年"));
		ageList.add(new Person(23, 40, "青年"));
		ageList.add(new Person(40, 50, "中年"));
		ageList.add(new Person(50, 200, "老年"));
		for (int i = 0; i < ageList.size(); i++) {
			 person = (Person) ageList.get(i);
			 if (age>=person.min&&age<person.max) {
				System.out.println(person.s);
			}
		}
	}
}
class Person{
	int min = 0;
	int max = 0;
	String s = null;
	public Person(int min, int max, String s) {
		this.min = min;
		this.max = max;
		this.s = s;
	}
	public Person() {
		this.min = min;
		this.max = max;
		this.s = s;
	}
	
}