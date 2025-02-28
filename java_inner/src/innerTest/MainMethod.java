package innerTest;

public class MainMethod {

	public static void main(String[] args) {

		Tire tire = new Tire();
		tire.setInch(18);
	
		Car car = new Car(tire);
		
		System.out.println(car.getTire().getInch());//포함관계이므로 2단계를 써서 가져옴
		
		
		
	}

}
//상속 관계와 포함관계
// 직업  프로그램 개발자
// 필기도구 볼펜 상속관계
// 과일   오렌지 상속관계
// 자전거 체인 포함관계
// 김미란 최예나 메타7회차 포함관계