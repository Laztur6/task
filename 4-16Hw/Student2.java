package priv.szq.base.day6Hw;

public class Student2 {

	
	
	private String name;
	private int age;
	private String major;
	private	 char sex;
	
	
	public Student2() {
		this.major = "�������";
		this.sex = '��';
		
	}
	

	public String toString() {
		return "��Һ�,�ҵ����ֽ�" + name + ","+"�Ա�:"+sex+" ����" + age + "����,���Գ�ɳ,��ҵ��XX����ѧԺ��ѧϰ����"+major+"רҵ";
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
			stu2.setName("����");
			stu2.setAge(22);
			System.out.println(stu2.toString());
	}
}
