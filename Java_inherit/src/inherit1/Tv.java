package inherit1;

public class Tv extends Product { //자식클래스의 범위를 확장
	
	public Tv() {}
	public Tv(String brand, int price, String name) 
	{this.brand=brand; this.price =price; this.name=name;}
}
