package priv.szq.base.day7Hw;

public class HomeWork01 {
	// ��״̬
	// ��ʻ����վ��ͣ��
	// �𳵷���
	// �Ͽ�,�¿�,����,����
	public static void main(String[] args) {
		Train train = null;
		train = getState("��ʻ");
		train.open();
		train.close();
		train.down();
		train.load();

	}

		static Train getState(String type) {
		if (type.equals("��ʻ")) {
			return new Run();

		} else if (type.equals("��վ")) {
			return new DaoZhan();
		} else if (type.equals("ͣ��")) {
			return new TingYun();
		}
		return null;
	}
}
	abstract class Train {
		abstract void load();

		abstract void down();

		abstract void open();

		abstract void close();
	}

	class Run extends Train {

		void load() {
			System.out.println("����������״̬�����Ͽ�");
		}

		void down() {
			System.out.println("����������״̬�����¿�");
		}

		void open() {
			System.out.println("����������ת̨���ܿ���");
		}

		void close() {
			System.out.println("�������ǹص�");
		}
	}

	class DaoZhan extends Train {

		void load() {
			System.out.println("��վ��,�����Ͽ�");

		}

		void down() {
			System.out.println("��վ��,�����¿�");
		}

		void open() {
			System.out.println("Ҫ���¿�,�ſ���");
		}

		void close() {
			System.out.println("Ҫ���¿�,�Ų��ܹ�");

		}
	}

	class TingYun extends Train {

		void load() {
			System.out.println("��ͣ����,û�г˿�");
		}

		void down() {
			System.out.println("��ͣ����,û�г˿�");
		}

		void open() {
			System.out.println("��ͣ��,ά����Ա���Կ���");
		}

		void close() {
			System.out.println("��ͣ��,ά����Ա���Թ���");
		}
	}
