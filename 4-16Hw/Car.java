package priv.szq.base.day6Hw;

public class Car {

	private String color;
	private String name;
	private String productPlace;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductPlace() {
		return productPlace;
	}
	public void setProductPlace(String productPlace) {
		this.productPlace = productPlace;
	}
	public Car() {
		this.name = name;
		this.color = color;
		this.productPlace = productPlace;
	}
	public Car(String name, String color, String productPlace) {
		this.name = name;
		this.color = color;
		this.productPlace = productPlace;
	}
	void Run(){
		System.out.println("����"+name+"��,��ɫ��"+color+",������"+productPlace);
	}
	private void Run(int speed) {
		System.out.println("����"+name+"��,��ɫ��"+color+",������"+productPlace+",���ʱ��"+speed);
	}
	public static void main(String[] args) {
		Car car = new Car("�µ�","��ɫ","�¹�");
		car.Run();
		car.Run(380);
	}

	
}
