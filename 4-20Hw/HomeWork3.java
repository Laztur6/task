package priv.szq.base.day4_21Hw;



public class HomeWork3 {
	public static void main(String[] args) {
		getPascal("this is name split");
	}

	private static void getPascal(String str) {
		String[] str2 = str.split(" ");//按空格切割字符串 
		String str3 ="";
		for (int i = 0; i < str2.length; i++) {
			//把str2中的每个数组转换成char数组
			char[] ca = str2[i].toCharArray();
			//把ca数组的首个字母转成大写
				if (ca[0]>='a'&&ca[0]<='z') {
					ca[0] = (char) (ca[0]-32);
					//把ca中的值全部赋给str3
					for (int j = 0; j < ca.length; j++) {
						 str3 += (ca[j]+"");
					}
			}
		}
		System.out.println(str3);
	}
}
