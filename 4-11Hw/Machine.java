package priv.szq.base.dy3Hw;

public class Machine {

	String name = "AI";
	
	int integral;
	int pun;
	void punch(){
		pun = (int)(Math.random()*3+1);
			switch (pun) {
			case 1:
				System.out.println(name+":����ʯͷ");
				break;
			case 2:
				System.out.println(name+":���ļ���");
				break;
			case 3:
				System.out.println(name+":���Ĳ�");
				break;
			default:
				break;
			}
			
		}
		
	}
