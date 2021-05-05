package priv.szq.base.day4_24Hw;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork1 {

//	��һ��TreeSet�������һ������
//	������18����
//	���ģ�19��Ů
//	������18��Ů
//	������19��Ů
//	Ҫ��������ͬ�Ķ���ֻ�ܷ�һ��
	public static void main(String[] args) {
		Set<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person("����", 18, "��"));
		treeSet.add(new Person("����", 20, "Ů"));
//		treeSet.add(new Person("����", 18, "Ů"));
		treeSet.add(new Person("����", 19, "Ů"));
		
		System.out.println(treeSet);
	}

}
class Person<E> implements Comparable<Person>{
	
	 String name;
	 int age;
	 String sex;

	public Person(String name,int age,String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}




	public int compareTo(Person o) {
		if (this.name.equals(o.name)) {
			return 0;
		}
		return 1;
	}

	


	
}