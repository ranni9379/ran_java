package inherit1;

public class Aircon extends Product {

	public Aircon() {}

	public Aircon(String brand, int price, String name)
	{super(brand,price,name);	}
	
	public void power() {
		onOff = !onOff;
		System.out.println("에어컨 전원 : " + onOff);
	}

}
