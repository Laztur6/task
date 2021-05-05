package priv.szq.base.day4_24Hw;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork1 {

//	搞一个TreeSet，里面放一个对象，
//	张三，18，男
//	李四，19，女
//	老王，18，女
//	张三，19，女
//	要求，姓名相同的对象，只能放一个
	public static void main(String[] args) {
		Set<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person("张三", 18, "男"));
		treeSet.add(new Person("李四", 20, "女"));
//		treeSet.add(new Person("老王", 18, "女"));
		treeSet.add(new Person("张三", 19, "女"));
		
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