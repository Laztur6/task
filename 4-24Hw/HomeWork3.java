package priv.szq.base.day4_24Hw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import priv.szq.base.day4_15Hw.Array;
//��һ��100�����Ȳ��Ҳ��ظ���������飬����ֵ��ȡֵ��Χ0-500��
public class HomeWork3 {
	public static void main(String[] args) {
		
			 Set set= new HashSet();
			 while (true) {
				 set.add((int)(Math.random()*500));
				 if (set.size()==100) {
					break;
				}
			}
			 Object[] array = set.toArray();
			 System.out.println(Arrays.toString(array));
//			 System.out.println(set.size());
	}
}
