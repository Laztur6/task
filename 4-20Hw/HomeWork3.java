package priv.szq.base.day4_21Hw;



public class HomeWork3 {
	public static void main(String[] args) {
		getPascal("this is name split");
	}

	private static void getPascal(String str) {
		String[] str2 = str.split(" ");//���ո��и��ַ��� 
		String str3 ="";
		for (int i = 0; i < str2.length; i++) {
			//��str2�е�ÿ������ת����char����
			char[] ca = str2[i].toCharArray();
			//��ca������׸���ĸת�ɴ�д
				if (ca[0]>='a'&&ca[0]<='z') {
					ca[0] = (char) (ca[0]-32);
					//��ca�е�ֵȫ������str3
					for (int j = 0; j < ca.length; j++) {
						 str3 += (ca[j]+"");
					}
			}
		}
		System.out.println(str3);
	}
}
