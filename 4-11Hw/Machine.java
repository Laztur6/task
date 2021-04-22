package priv.szq.base.dy3Hw;

public class Machine {

	String name = "AI";
	
	int integral;
	int pun;
	void punch(){
		pun = (int)(Math.random()*3+1);
			switch (pun) {
			case 1:
				System.out.println(name+":出的石头");
				break;
			case 2:
				System.out.println(name+":出的剪刀");
				break;
			case 3:
				System.out.println(name+":出的布");
				break;
			default:
				break;
			}
			
		}
		
	}
