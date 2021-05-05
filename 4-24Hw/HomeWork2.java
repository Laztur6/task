package priv.szq.base.day4_24Hw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HomeWork2 {
//	��һ��HashMap,�洢10���������󣬺����Ƕ�Ӧ�Ĳ��ء�
//	������
//	Ʒ�ơ����������۸�
//	�����Ʒ�ơ����������۸���ȫ��ͬ����Ϊ�ظ����������ظ���
//	�������map����ӡ���ǵ�Ʒ�ơ��۸�Ͳ���


	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(new Car("�µ�", "2.4L", 36.6), "�¹�");
		map.put(new Car("�µ�", "2.4L", 36.5), "�¹�");
		map.put(new Car("����", "3.0L", 40.2), "�¹�");
		
		Set entrySet = map.entrySet();
		for (Object object : entrySet) {
			Entry en = (Entry) object;
			System.out.printf("%s-->%s",en.getKey(),en.getValue());
			System.out.println();
		}

	}
}
class Car  {
	String pp;
	String pql;
	double price;
	public Car(String pp, String pql, double price) {
		this.pp = pp;
		this.pql = pql;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ʒ��:"+pp+"   �۸�:"+price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pp == null) ? 0 : pp.hashCode());
		result = prime * result + ((pql == null) ? 0 : pql.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (pp == null) {
			if (other.pp != null)
				return false;
		} else if (!pp.equals(other.pp))
			return false;
		if (pql == null) {
			if (other.pql != null)
				return false;
		} else if (!pql.equals(other.pql))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
	
}