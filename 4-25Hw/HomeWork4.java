package priv.szq.base.homework;

public class HomeWork4 {

	public static void foo(int i) throws Exception {
		try {
			if (i == 1) {
				throw new Exception();
			}
			System.out.print("1");
		} catch (Exception e) {
			System.out.print("2");
		} finally {
			System.out.print("3");
		}
		System.out.print("4");
	}

	public static void main(String[] args) throws Exception{
					foo(1);
					
			System.out.println("因为当程序遇到异常,catch会捕获,并运行下面代码");
			System.out.println("finally里面的语句是永远会被执行的,");
			System.out.println("因为捕获了异常，所以程序不会终止,会运行后续代码");
			
//	try{
//	尝试有没有异常
//	------异常点之后的代码不执行
//	}catch(Exception e){
//		如果你接受到了异常
//	}finally{
//		正常和异常都执行
//	}
	}
}
