package priv.szq.base;

public class HomeWork_4_8 {

	
	public static void main(String[] args) {
		System.out.println("--------------��һ��---------------");
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+"x"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		
		System.out.println("--------------�ڶ���---------------");
			int i=10;
			long l = i+1;
			System.out.println("long:"+l+"\t"+"int�ڸ�long��������ʱ�Զ�ת��ΪLong����");
		
			
		System.out.println("--------------������---------------");
		
		int i3 = 89;
		int i3day = i3/24;
		int i3time = i3%24;
		System.out.println("����������ս:"+i3day+"��"+i3time+"��Сʱ");
		
		
		System.out.println("--------------������---------------");
		
		int left = 10;
		int rihgt = 8;
		
		int jh = left;
		left = rihgt;
		rihgt = jh;
		System.out.println("����ǰС�������Ǻ���10,�����Ǻ���8");
		System.out.println("������С�������Ǻ���"+left+",�����Ǻ���"+rihgt);
		
		
		
		System.out.println("--------------������---------------");
		
		double d5c = 1.9;
		double d5k = 0.3;
		double d5mj = d5c*d5k;
		double d5zc = 2*(d5c+d5k);
		
		System.out.println("���ε����Ϊ:"+d5mj+"���ε��ܳ�Ϊ:"+d5zc);
		
		
	}
}
