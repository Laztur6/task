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
		System.out.println("������Ҫ��ѯ������:");
		int jiSuan = ((scan.nextInt()+8)%12);
		 List shengXiao= new ArrayList();
//		 ��ţ�������á������ߡ����򡢺��������
		 shengXiao.add(new ShengXiaoBiao("��", "������������ദ������Ŭ��"));
		 shengXiao.add(new ShengXiaoBiao("ţ", "��ţ���������ǿ���ڷ�̤ʵ"));
		 shengXiao.add(new ShengXiaoBiao("��", "�������˶����������Ķ���ǿ"));
		 shengXiao.add(new ShengXiaoBiao("��", "���õ����ر��ºͣ��ľ���ǫǫ����"));
		 shengXiao.add(new ShengXiaoBiao("��", "�������˽�������Ϣ������ľ���"));
		 shengXiao.add(new ShengXiaoBiao("��", "���ߵ��˸���ʵ���������������ߵĵ���"));
		 shengXiao.add(new ShengXiaoBiao("��", "������˾��в��Ϸ�����Ը�"));
		 shengXiao.add(new ShengXiaoBiao("��", "���������������ƺ�ʩ"));
		 shengXiao.add(new ShengXiaoBiao("��", "������˾���ǿ�ҵĽ�ȡ��"));
		 shengXiao.add(new ShengXiaoBiao("��", "���������ó��������˵���˼����Ӧ����"));
		 shengXiao.add(new ShengXiaoBiao("��", "�������˷ǳ����ص��ˣ�����С�ġ�����"));
		 shengXiao.add(new ShengXiaoBiao("��", "�������ͷ�ԱȽ��侲��ϸ��"));
		 System.out.println(shengXiao.get(jiSuan));
//		 System.out.println(shengXiao);
	}

}
class ShengXiaoBiao{
	String sx;//��Ф
	String td;//�ص�
	
	public ShengXiaoBiao(String sx, String td) {
		this.sx = sx;
		this.td = td;
	}

	@Override
	public String toString() {
		return "����:" + sx + "  �ص�:" + td;
	}
	
}