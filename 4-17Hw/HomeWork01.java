package priv.szq.base.day7Hw;

public class HomeWork01 {
	// 火车状态
	// 行驶，到站，停运
	// 火车方法
	// 上客,下客,开门,关门
	public static void main(String[] args) {
		Train train = null;
		train = getState("行驶");
		train.open();
		train.close();
		train.down();
		train.load();

	}

		static Train getState(String type) {
		if (type.equals("行驶")) {
			return new Run();

		} else if (type.equals("到站")) {
			return new DaoZhan();
		} else if (type.equals("停运")) {
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
			System.out.println("现在是运行状态不能上客");
		}

		void down() {
			System.out.println("现在是运行状态不能下客");
		}

		void open() {
			System.out.println("现在是运行转台不能开门");
		}

		void close() {
			System.out.println("现在门是关的");
		}
	}

	class DaoZhan extends Train {

		void load() {
			System.out.println("到站了,可以上客");

		}

		void down() {
			System.out.println("到站了,可以下客");
		}

		void open() {
			System.out.println("要上下客,门开了");
		}

		void close() {
			System.out.println("要上下客,门不能关");

		}
	}

	class TingYun extends Train {

		void load() {
			System.out.println("火车停运了,没有乘客");
		}

		void down() {
			System.out.println("火车停运了,没有乘客");
		}

		void open() {
			System.out.println("火车停运,维修人员可以开门");
		}

		void close() {
			System.out.println("火车停运,维修人员可以关门");
		}
	}
