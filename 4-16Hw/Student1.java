package priv.szq.base.day6Hw;

public class Student1 {

	
	
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return "��Һ�,�ҵ����ֽ�" + name + ", ����" + age + "����,���Գ�ɳ";
	}

	public void setAge(int age) {
		if (age>16) {
			this.age = age;
		}else {
			System.out.println("�����������,С��16��");
		}
		
	}

	public static void main(String[] args) {
		Student1 stu = new Student1();
		stu.setName("����");
		stu.setAge(17);
		System.out.println(stu.toString());
		
	}
}
