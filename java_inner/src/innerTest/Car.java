package innerTest;

public class Car {
	private Tire tire;// 객체 만들어질 준비됨
//	public Car() {
//		tire = new Tire();
//	}
	public Car(Tire tire) {
		this.setTire(tire);
	}// 일반적으로 클래스 외부에서 가져옴 // 자동차 외부에서 타이어를 만들어오는 것으로 생각
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	//{} 초기화 블럭
	// 포함관계에서 클래스객체 생성시기
	// private로 get, set 메서드 가져온다.

}
