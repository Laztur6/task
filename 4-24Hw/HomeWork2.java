package priv.szq.base.day4_24Hw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HomeWork2 {
//	搞一个HashMap,存储10个汽车对象，和他们对应的产地。
//	汽车：
//	品牌、排气量、价格
//	如果，品牌、排气量、价格完全相同则视为重复，不允许重复。
//	迭代这个map，打印他们的品牌、价格和产地


	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(new Car("奥迪", "2.4L", 36.6), "德国");
		map.put(new Car("奥迪", "2.4L", 36.5), "德国");
		map.put(new Car("宝马", "3.0L", 40.2), "德国");
		
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
		return "品牌:"+pp+"   价格:"+price;
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