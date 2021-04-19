package priv.szq.base;

public class HomeWork_4_8 {

	
	public static void main(String[] args) {
		System.out.println("--------------第一题---------------");
		for (int i = 1; i <=9; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+"x"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		
		System.out.println("--------------第二题---------------");
			int i=10;
			long l = i+1;
			System.out.println("long:"+l+"\t"+"int在跟long进行算术时自动转换为Long类型");
		
			
		System.out.println("--------------第三题---------------");
		
		int i3 = 89;
		int i3day = i3/24;
		int i3time = i3%24;
		System.out.println("抗洪连续作战:"+i3day+"天"+i3time+"个小时");
		
		
		System.out.println("--------------第四题---------------");
		
		int left = 10;
		int rihgt = 8;
		
		int jh = left;
		left = rihgt;
		rihgt = jh;
		System.out.println("交换前小明左手是黑桃10,右手是红心8");
		System.out.println("交换后小明左手是红心"+left+",右手是黑桃"+rihgt);
		
		
		
		System.out.println("--------------第五题---------------");
		
		double d5c = 1.9;
		double d5k = 0.3;
		double d5mj = d5c*d5k;
		double d5zc = 2*(d5c+d5k);
		
		System.out.println("矩形的面积为:"+d5mj+"矩形的周长为:"+d5zc);
		
		
	}
}
