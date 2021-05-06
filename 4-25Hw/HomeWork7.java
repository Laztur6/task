package priv.szq.base.homework;

public class HomeWork7 {
//	编写一段能产生空指针异常的代码，
//	并运用异常处理机制进行处理，并判断在finally块输出是否抛出了异常。
//	（提示：因为不管是否有异常都会进入finally块中）。
	public static void main(String[] args) {
		test();
	}

private static void test() {
	int sum = 0;
	try {
		Person person = null;
		person.toString();
	} catch (Exception e) {
		sum++;
		e.printStackTrace();
	}finally{
		if (sum>0) {
			System.out.println("产生异常了,已经处理了");
		}
	}
}
}

class Person{}
