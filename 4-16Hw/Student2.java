package priv.szq.base.day6Hw;

public class Student2 {

	
	
	private String name;
	private int age;
	private String major;
	private	 char sex;
	
	
	public Student2() {
		this.major = "软件开发";
		this.sex = '男';
		
	}
	

	public String toString() {
		return "大家好,我的名字叫" + name + ","+"性别:"+sex+" 今年" + age + "岁了,来自长沙,毕业于XX技术学院，学习的是"+major+"专业";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getMajor() {
		return major;
	}

	public char getSex(){
		return sex;
	}




	public static void main(String[] args) {
		Student2 stu2 = new Student2();
			stu2.setName("李四");
			stu2.setAge(22);
			System.out.println(stu2.toString());
	}
}
