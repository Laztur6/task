package priv.szq.base.day4_19Hw2;

public class HomeWork1 {
	public static void main(String[] args) {
		LingHuChong lhc = new LingHuChong();
		lhc.lianWu();
		lhc.WuLinDaHui();
		lhc.play();

		
		
	}
	

}
class LingHuChong implements HuaShan, HengShan, MoJiao{

	public void lianWu() {
		System.out.println("在思过崖练武");
	}

	public void WuLinDaHui() {
		System.out.println("参加武林大会");
	}

	public void play() {
		System.out.println("去魔教玩");
	}}
interface HuaShan{

	void lianWu();}
interface HengShan{

	void WuLinDaHui();}
interface MoJiao{

	void play();}