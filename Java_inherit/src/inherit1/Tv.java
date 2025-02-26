package inherit1;

public class Tv extends Product { //자식클래스의 범위를 확장
	
	public Tv() {
		super();// 부모클래스의 생성자메서드가 반드시 먼저 실행된다.
		System.out.println("자식클래스생성");
//super는 부모클래스의 객체를 의미한다.
	
	}
	public Tv(String brand, int price, String name) 
	{super(brand,price,name);//super은 부모를 뜻함
//		super.brand=brand; this.price =price; this.name=name;
	}

// 오버라이딩 - 상속관계인 경우, 인터페이스 implements인 경우에 사용 
// 같은 클래스 내에서 매개변수 타입, 갯수 일치되지 않고, 메서드 내용만 바뀌는 것
// 성립조건
	//1. 메서드의 원형은 그대로 유지
	//2. 내용만 변경한다.
	//3. 상속 또는 implements인 경우에만 가능
	@Override
	public void power() {
		onOff = !onOff;
		System.out.println("TV 전원 : " + onOff);
	}
	
}

