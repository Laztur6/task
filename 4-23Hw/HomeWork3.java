package priv.szq.base.day4_23Hw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		while (true) {
			getShengXiao();
		}
		
	}

	private static void getShengXiao() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入要查询的年龄:");
		int jiSuan = ((scan.nextInt()+8)%12);
		 List shengXiao= new ArrayList();
//		 鼠、牛、虎、兔、龙、蛇、马、羊、猴、鸡、狗、
		 shengXiao.add(new ShengXiaoBiao("鼠", "属鼠的人容易相处，工作努力"));
		 shengXiao.add(new ShengXiaoBiao("牛", "属牛的人义务感强，勤奋踏实"));
		 shengXiao.add(new ShengXiaoBiao("虎", "属虎的人独立和自尊心都极强"));
		 shengXiao.add(new ShengXiaoBiao("兔", "属兔的人特别温和，文静，谦谦有礼"));
		 shengXiao.add(new ShengXiaoBiao("龙", "属龙的人健康的气息与无穷的精力"));
		 shengXiao.add(new ShengXiaoBiao("蛇", "属蛇的人富有实力，是理想主义者的典型"));
		 shengXiao.add(new ShengXiaoBiao("马", "属马的人具有不肯服输的性格"));
		 shengXiao.add(new ShengXiaoBiao("羊", "属羊的人最富温情乐善好施"));
		 shengXiao.add(new ShengXiaoBiao("猴", "属猴的人具有强烈的进取心"));
		 shengXiao.add(new ShengXiaoBiao("鸡", "属鸡的人擅长看穿别人的心思，反应敏锐"));
		 shengXiao.add(new ShengXiaoBiao("狗", "属狗的人非常保守的人，生性小心、谨慎"));
		 shengXiao.add(new ShengXiaoBiao("猪", "属猪的人头脑比较冷静，细心"));
		 System.out.println(shengXiao.get(jiSuan));
//		 System.out.println(shengXiao);
	}

}
class ShengXiaoBiao{
	String sx;//生肖
	String td;//特点
	
	public ShengXiaoBiao(String sx, String td) {
		this.sx = sx;
		this.td = td;
	}

	@Override
	public String toString() {
		return "属相:" + sx + "  特点:" + td;
	}
	
}