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
		return "大家好,我的名字叫" + name + ", 今年" + age + "岁了,来自长沙";
	}

	public void setAge(int age) {
		if (age>16) {
			this.age = age;
		}else {
			System.out.println("年龄输入错误,小于16岁");
		}
		
	}

	public static void main(String[] args) {
		Student1 stu = new Student1();
		stu.setName("张三");
		stu.setAge(17);
		System.out.println(stu.toString());
		
	}
}
